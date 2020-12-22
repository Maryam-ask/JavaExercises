package Lesson10;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maryam Askari
 * Date: 11/27/2020
 * Time: 7:27 PM
 * Project: IntelliJ IDEA
 */
public class Gym {
    private static final String directoryPath = "D:\\Java_Home(training)\\File\\";
    private static final String customerFilePath = "D:\\Java_Home(training)\\File\\Customers.txt";

    public List readFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream(customerFilePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            List<Person> filereader = new ArrayList<>();
            String reader;

            while ((reader = bufferedReader.readLine()) != null) {

                Person person = new Person();
                String[] s = reader.split(",");
                person.setIdNumber(s[0]);
                person.setFullName(s[1]);
                filereader.add(person);

                reader = bufferedReader.readLine();
                LocalDate localDate = LocalDate.parse(reader);
                person.setDate(localDate);
            }

            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();

            return filereader;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    public Person checkName(String name, List<Person> pList) {
        Person pResult = null;

        for (Person p : pList) {
            if (name.equals(p.getFullName().trim())) {
                pResult = p;
                break;
            }
        }
        return pResult;
    }

    public boolean checkDate(Person person) {
        LocalDate now = LocalDate.now();

        int personDateDays = person.getDate().getDayOfYear();
        int nowDays = now.getDayOfYear();
        int counter = 0;

        if (person.getDate().getYear() == now.getYear()) {
            counter = nowDays - personDateDays;
        } else if (person.getDate().getMonthValue() >= now.getMonthValue() && (now.getYear() - person.getDate().getYear() == 1)) {
            counter = nowDays + (365 - personDateDays);
        } else {
            counter = 366;
        }
        return counter <= 365;
    }


    public File creatFile(Person person, String plan) {

        try {
            File file = new File(directoryPath + person.getFullName() + ".txt");
            if (file.exists()) {
                String readf;
                FileWriter fw = new FileWriter(directoryPath + person.getFullName() + ".txt", true);
                fw.write("\n" + LocalDate.now().toString() + "\n" + plan);
                fw.close();
            } else {

                file.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(LocalDate.now().toString().getBytes());
                fileOutputStream.write("\n".getBytes());
                fileOutputStream.write(plan.getBytes());
                fileOutputStream.close();
            }

            return file;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public File creatReceptionFile(Person person) {
        try {
            File file = new File(directoryPath + "Reception.txt");
            if (file.exists()) {
                FileWriter fileWriter = new FileWriter(directoryPath + "Reception.txt", true);
                fileWriter.write("\n" + person.getFullName() + "\n" + LocalDate.now().toString());
                fileWriter.close();
            } else {
                file.createNewFile();
                FileWriter fileWriter = new FileWriter(directoryPath + "Reception.txt", true);
                fileWriter.write(person.getFullName() + "\n" + LocalDate.now().toString());
                fileWriter.close();
            }
            return file;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
