package Lesson3_HASHMAP;

import java.util.HashMap;

/**
 * Created by Maryam Askari
 * Date: 12/21/2020
 * Time: 9:58 PM
 * Project: IntelliJ IDEA
 */
public class HashTest {
    public static void main(String[] args) {

        HashMap<String,String> myMap = new HashMap();

        myMap.put("Maryam","Blue");
        myMap.put("Arezoo","pink");
        myMap.put("Donya","Black");


        // Tamame key ha va value haye HashMap ra chap mikonad
        System.out.println(myMap);

        System.out.println("****************************");

        // Baraye neshon dadane ksize HashMap az .size()
        System.out.println(myMap.size());

        System.out.println("****************************");

        // Baraye gereftane Value an key az .get(key) estefade mikonim.
        System.out.println("The value of Maryam key is: ");
        System.out.println(myMap.get("Maryam"));

        System.out.println("****************************");

        //**** Baraye namayesh dadane kole klid ha(key ha) az foor loop mitavan estefade kard.*******
        System.out.println("THE KEYS ARE");
        for (String k : myMap.keySet()){
            System.out.println(k);
        }

        System.out.println("****************************");

        // *****Baraye neshon dadane kole value ha ham mitavan az for-loop estefade kard.******
        System.out.println("THE VALUES ARE:");
        for (String v : myMap.values()){
            System.out.println(v);
        }

        System.out.println("****************************");

        // baraye gereftane ham klid ha va ham value ha ham mitavan az for-loop estefade kard
        for (String v : myMap.keySet()){
            System.out.println(" KEY: "+ v + "\t VALUE : "+ myMap.get(v));
        }

        System.out.println("****************************");

        // To remove an item..... .remove(key)
        myMap.remove("Donya");
        System.out.println(myMap);

        System.out.println("****************************");

        // To remove all items. baraye pak kardane kole HashMap az .clear()
        myMap.clear();
        System.out.println(myMap);

    }
}
