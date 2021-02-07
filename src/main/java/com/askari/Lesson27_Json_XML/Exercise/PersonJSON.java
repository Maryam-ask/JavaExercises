package com.askari.Lesson27_Json_XML.Exercise;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Maryam Askari
 * Date: 2/7/2021
 * Time: 3:23 PM
 * Project: IntelliJ IDEA
 */
public class PersonJSON {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("Id",1L);
            jsonObject.put("Name","Maryam");
            jsonObject.put("LastName","Askari");
            jsonObject.put("age",26);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        System.out.println(jsonObject.toString());

    }
}
