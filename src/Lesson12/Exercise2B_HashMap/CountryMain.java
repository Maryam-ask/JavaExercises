package Lesson12.Exercise2B_HashMap;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Maryam Askari
 * Date: 12/21/2020
 * Time: 10:55 PM
 * Project: IntelliJ IDEA
 */
public class CountryMain {
    public static void main(String[] args) {
        CountryFile countryFile = new CountryFile();
        Scanner input = new Scanner(System.in);
        HashMap<String, String> countries = new HashMap();

        System.out.println("Write the file name?");
        String fileName = input.nextLine();
        countries = countryFile.redFile(fileName);

        // System.out.println(countries); // Only for testing.....

        int correctAnswer = 0;
        int wrongAnswer = 0;
        /*
        //****** Ba estefade az Map.Entry ********************
        for (Map.Entry <String,String> entry : countries.entrySet()){
            System.out.println("What is the capital city of " +entry.getKey() +"?");
             String answer = input.next();
             String cityName = entry.getValue();
             if (cityName.equalsIgnoreCase(answer)) {
                 System.out.println("Javabet doroste, Afarin!!!");
                 correctAnswer++;
             } else {
                 System.out.println("Javab ghalat ast!!!!!");
                 System.out.println("Javabe sahih: " + cityName);
                 wrongAnswer++;
             }
        }
*/
        //****** Ba estefade az halgheye for-each **********
        for (String country : countries.keySet()) {
            System.out.println("What is the capital city of " + country + "?");
            String answer = input.next();
            String cityName = countries.get(country);
            if (cityName.equalsIgnoreCase(answer)) {
                System.out.println("Javabet doroste, Afarin!!!");
                correctAnswer++;
            } else {
                System.out.println("Javab ghalat ast!!!!!");
                System.out.println("Javabe sahih: " + cityName);
                wrongAnswer++;
            }
        }

        System.out.println("Tedade javab haye dorost: " + correctAnswer);
        System.out.println("Tedade javab haye ghalat: " + wrongAnswer);

        if(correctAnswer>wrongAnswer){
            System.out.println("Congratulation! YOU WINN!  ");
        } else {
            System.out.println("YOU LOSE!");
        }
    }
}
