package Lesson7.Exercise1;

import java.io.*;

/**
 * Created by Maryam Askari
 * Date: 11/21/2020
 * Time: 2:22 PM
 * Project: IntelliJ IDEA
 */
public class ObjectFile {
    public static void main(String[] args) {
        writeObject();
        readObject();
    }

    public static void writeObject(){

        Person p1 = new Person("Maryam",26,9408222900L);
        Person p2 = new Person("Angela",16,0414216145L);
        Person p3 = new Person("Anthony",18,8804142159L);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Java_Home(training)\\File\\Person.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(p1);
            objectOutputStream.writeObject(p2);
            objectOutputStream.writeObject(p3);

            fileOutputStream.close();
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readObject(){

        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\Java_Home(training)\\File\\Person.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person person1 =(Person) objectInputStream.readObject();
            Person person2 =(Person) objectInputStream.readObject();
            Person person3 =(Person) objectInputStream.readObject();

            fileInputStream.close();
            objectInputStream.close();

            System.out.println("Person1: "+person1.getName()+" "+person1.getAge()+" "+person1.getIdNumber());
            System.out.println("Person2: "+person2.getName()+" "+person2.getAge()+" "+person2.getIdNumber());
            System.out.println("Person3: "+person3.getName()+" "+person3.getAge()+" "+person3.getIdNumber());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
