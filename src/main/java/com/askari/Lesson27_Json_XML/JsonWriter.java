package com.askari.Lesson27_Json_XML;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Maryam Askari
 * Date: 2/7/2021
 * Time: 1:59 PM
 * Project: IntelliJ IDEA
 */
public class JsonWriter {


    public static void writeJson() {
        JSONObject jsonObject = new JSONObject();



            jsonObject.put("name", "maryam");
            jsonObject.put("age", new Integer(100));

            JSONArray list = new JSONArray();
            list.add("msg1");
            list.add("msg2");

            jsonObject.put("message", list);


        System.out.println(jsonObject.toString());
        try {

            FileWriter fileWriter = new FileWriter("D:\\Java_Home(training)\\File\\Json.txt");
            fileWriter.write(jsonObject.toString());
            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readFile() {
        JSONParser parser = new JSONParser();
    }

    public static void main(String[] args) {
        writeJson();
    }

}
