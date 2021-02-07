package com.askari.myExercises;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maryam Askari
 * Date: 2/2/2021
 * Time: 6:54 PM
 * Project: IntelliJ IDEA
 */
public class FileReader {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\Java_Home(training)\\File\\sample.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            List<Long> result = new ArrayList<>();
            String reader;
            while ((reader= bufferedReader.readLine() )!= null){
                String[] number = reader.split(" ");
                long number1 = Long.parseLong(number[0]);
                long number2 = Long.parseLong(number[1]);
                long min = Math.abs(number2-number1);
                result.add(min);
            }
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
            File file = new File("D:\\Java_Home(training)\\File\\result.txt");
            if(file.exists()){
                FileWriter fileWriter= new FileWriter(file,true);
                for (Long i : result){
                    fileWriter.write(i+"\n");
                }
                fileWriter.close();
            } else {
                file.createNewFile();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
