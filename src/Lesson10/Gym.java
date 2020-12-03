package Lesson10;

import java.io.*;
import java.security.PrivateKey;
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
    public static List readFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(customerFilePath);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        List<Person> filereader = new ArrayList<>();
        String reader;
        try {
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
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
        bufferedReader.close();
        inputStreamReader.close();
        fileInputStream.close();
        return filereader;
    }

    public static boolean checkName(String name) {
        Person person = new Person();
        return name.equals(person.getFullName());
    }

    public static boolean checkDate(Person person) {
        LocalDate now = LocalDate.now();

        int personDateDays = person.getDate().getDayOfYear();
        int nowDays = now.getDayOfYear();
        int counter = 0;

        if (person.getDate().getYear() == now.getYear()) {
            counter = nowDays - personDateDays;
        } else if (person.getDate().getMonthValue() >= now.getMonthValue() && (now.getYear() - person.getDate().getYear() == 1)) {
            counter = nowDays + (365-personDateDays);
        }else {
            counter = 366;
        }
        return counter<=365;
    }
    public static File creatFile(Person person){
        File file = new File(directoryPath+person.getFullName()+".txt");
            if (file.exists()) {
                System.out.println("File Exists.");
            } else {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        return file;
    }

}
