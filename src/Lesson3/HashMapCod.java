package Lesson3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Maryam Askari
 * Date: 11/8/2020
 * Time: 1:53 PM
 * Project: IntelliJ IDEA
 */
public class HashMapCod {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("Maryam","Student");
        map.put("Sigrun","Teacher");
        map.put("Stefan","Rector");
        map.put("Katrina","Student counselor");
        map.put("David","Student");

        for (Map.Entry <String,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" is "+ entry.getValue());
        }
    }
}
