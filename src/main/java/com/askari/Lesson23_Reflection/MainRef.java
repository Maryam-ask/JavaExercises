package com.askari.Lesson23_Reflection;

import java.lang.reflect.Field;

/**
 * Created by Maryam Askari
 * Date: 1/16/2021
 * Time: 5:47 PM
 * Project: IntelliJ IDEA
 */
public class MainRef {
    /*
     Mikhahim kelase Marzieh ra seda bezanim ama na az tarighe Object sakhtan az an.
     Va az in tarigh karbar mitavanad method haye Class ra farakhani konad.
     */
    public static void main(String[] args) {

        try {
            //String str = "c";
            //String str = "a1";
            /*
            Method haye Static ra ham mishe sakht. vali ma niazi be sakhte Object baraye seda zadane Methodhaye Static nadarim.
            Mitavanim methodhaye Static ra az roye esme Class ham farakhani konim.
             */
            //String str="f"; // in method ra nadarim va be ma khata midahad.
            //String str = "a2"; // Chon Private hast khataye dastresi be ma midahad. Vali be an dastresie invoke nadarim.
            //String str = "bs"; // Methodi ke String Return mikonad.
            String str = "a3"; // Methodi ke vorodi darad.


            /*
             Baraye Avardane Class : Mire on Object ra miare dar sathe RAM. CHeck mikone ke in Classe to Ram hast.
             */
            Class aClass = Class.forName("com.askari.Lesson23_Reflection.Marzieh");



            /*
             Ye moteghayer az jense Object misazam.
             Ye Copy az JVM Migiram
             Ye Instance az on Object ra misazad. ye nemone az Object.
             Dar in marhale Object farakhani shode va roye Ram mineshinad.
             */
            Object aObject = aClass.newInstance();



            /*
             Baraye anke Methode Class ra seda bezanim.(An Methodhaie ke ma mikhahim)
              Boro methodhara hara az ro on Copy ke az Object gereftim bede
             */
            //Method method = aObject.getClass().getDeclaredMethod(str);


            /*
             Baraye anke Methody ke vorodi darad ra betavanim begirim:
             Bayad vorodi haye an ra be sorate araye be an bedahim.
             Ye araye az jense Class misazim zira faghat jense vorodi hara midanim. ke motefavet hastand.
             */
            //Method method = aObject.getClass().getDeclaredMethod(str,new Class[]{String.class,Integer.class});



            /*
             Liste tamame method hara be man bedahad.
             */
            /*Method[] method = aObject.getClass().getDeclaredMethods();
            for (Method m : method){
                System.out.println("m.getName() : " + m.getName());
                System.out.println("m.getReturnType() : " + m.getReturnType());
                System.out.println(m.getExceptionTypes());
            }*/


            /*
            Baraye Gereftane Field ha:::::
            Arayeie az Field hara be man bedahad.
             */
            //Field[] fields = aObject.getClass().getDeclaredFields();


            /*
            Faghat ye Field ra be man bedahad..
             */
            //aObject.getClass().getField("hairColor");
            Field field = aObject.getClass().getDeclaredField("hairColor");
            System.out.println("field.getName() : " + field.getName());




            /*
            Zamani ke mikhahim in Methode vorodi dar ra invoke konim vorodi haye an ra be sorate araye be an midahim.
             */
            // String result = (String) method.invoke(aObject,new Object[]{"Javad",12});


            // method.setAccessible(true); // Baraye Dastresi dashtan be method haye Private!!!!!!



            /*
             Boro on method ra ke seda zadi ra ejra kon roye on Objecti ke sakhteiem.
             */
            //method.invoke(aObject);



            /*
             Zamani ke midanim khorojie Methodeman String ast.
              !!!!!Faghat Bayad ye Cast anjam dahim. Zira khorojie invoke() yek Object ast.....
             */
            //String result = (String) method.invoke(aObject);
            // System.out.println(result);


            //method.setAccessible(false); // Va dar akhar bad az anke an Method ra stefade kardim mitavanim dastresi be an ra bebandim.


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } /*catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }*/ catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }


}
