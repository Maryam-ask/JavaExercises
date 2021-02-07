package com.askari.Lesson12.Exercise2_List;

import java.io.*;

/**
 * Created by Maryam Askari
 * Date: 12/10/2020
 * Time: 1:37 PM
 * Project: IntelliJ IDEA
 */
public class CountryFile {

    public String[][] redFile(String fileName) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\Java_Home(training)\\File\\"+fileName+".txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String[][] fileReader = new String[4][2];
            String reader;
            int i=0;
            while ((reader = bufferedReader.readLine()) != null) {
                CountryClass c = new CountryClass();
                String[] s = reader.split(",");
                c.setCountryName(s[0]);
                c.setCountryCapitalCity(s[1].trim());

                fileReader[i][0] = c.getCountryName();
                fileReader[i][1] = c.getCountryCapitalCity();

                i++;
            }

            return fileReader;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean showCountry(String input ,String city) {

        boolean result = false;

        if (city.equalsIgnoreCase(input)) // ya horofo bozorg mikone ya kochik badam moghayese
            result = true;
         return result;

    }


}
