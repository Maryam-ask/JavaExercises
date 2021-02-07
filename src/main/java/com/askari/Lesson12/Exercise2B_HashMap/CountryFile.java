package com.askari.Lesson12.Exercise2B_HashMap;

import java.io.*;
import java.util.HashMap;

/**
 * Created by Maryam Askari
 * Date: 12/21/2020
 * Time: 9:32 PM
 * Project: IntelliJ IDEA
 */
public class CountryFile {

    public HashMap<String, String> redFile(String fileName) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\Java_Home(training)\\File\\" + fileName +".txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            HashMap<String, String> fileReader = new HashMap<>();
            String reader;
            int i = 0;

            while ((reader = bufferedReader.readLine()) != null) {
                String[] s = reader.split(",");
                fileReader.put(s[0], s[1].trim());
                i++;
            }

            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();

            return fileReader;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}