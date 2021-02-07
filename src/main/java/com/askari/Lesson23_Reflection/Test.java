package com.askari.Lesson23_Reflection;

/**
 * Created by Maryam Askari
 * Date: 1/16/2021
 * Time: 6:30 PM
 * Project: IntelliJ IDEA
 */
public class Test {

    public static void main(String[] args) {
        a("ss", "dd", "gggg");
        b("ss",23,"okj",11);
    }

    public static void a(String... s) { // Hamishe be onvane vorodie akhar mitavanad begirad.
        String[] dd = s;
        for (String s1 : dd) {
            System.out.println(s1);
        }
    }

    /*
    Zamani ke nemidanim vorodi az che jensi hast.
    Jense Vorodi ra Object migozarim.
     */
    public static void b(Object ... s) {
        Object[] dd = s;
        for (Object s1 : dd) {
            System.out.println(s1);
        }
    }
}
