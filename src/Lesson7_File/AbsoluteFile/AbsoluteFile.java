package Lesson7_File.AbsoluteFile;

import java.io.*;

/**
 * Created by Maryam Askari
 * Date: 11/21/2020
 * Time: 3:32 PM
 * Project: IntelliJ IDEA
 */
public class AbsoluteFile {

    public static void main(String[] args) throws IOException {


        File file = writeFile();
        if (file.exists()) {
            System.out.println("File exist ....");
            readFile(file);
            System.out.println(file.length());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.delete());
        }


    }

    public static void readFile(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStream = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStream);

        String nameRead;
        while ((nameRead = bufferedReader.readLine()) != null) {
            System.out.println(nameRead);
        }
        bufferedReader.close();
        inputStream.close();
        fileInputStream.close();
    }


    public static File writeFile() {
        String name = "Salam man Maryam hastam. ";
        Integer age = 26;
        File file = null;
        try {
            file = creatFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(name.getBytes());
            fileOutputStream.write(age.toString().getBytes());
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;

    }

    public static File creatFile() throws IOException {

        File file = new File("D:\\Java_Home(training)\\File\\File.txt");
        if (file.exists()) {
            System.out.println("File Exists.");
        } else {
            file.createNewFile();
        }

        return file;
    }
}
