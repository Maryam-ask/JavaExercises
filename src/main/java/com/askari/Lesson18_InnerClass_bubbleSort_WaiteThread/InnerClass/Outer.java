package com.askari.Lesson18_InnerClass_bubbleSort_WaiteThread.InnerClass;

/**
 * Created by Maryam Askari
 * Date: 12/30/2020
 * Time: 7:33 PM
 * Project: IntelliJ IDEA
 */
public class Outer {

    private String name;
    private String family;

    public String getName(){
        return name;
    }

    public void outerMethod(){
        class Inner2{
            public void innerMethod(){
                System.out.println("Inner Method");
                System.out.println(getName());
            }
        }

        Inner2 in = new Inner2(); // dakhele khode method azash Objekt misazim.
        in.innerMethod();
    }

    class Inner{
      public void show(){

          System.out.println("Showwwwwwwwww");
          System.out.println(name+" "+family);
          getName(); // Dar Inner Class mitavan methode getName() ra call kard.
          // Ama daroone classe Main(Test) nemitavan az tarighe classe Inner getName() ra seda zad.

      }
    }

    public static void staticMethod(){
        System.out.println("*************");
    }


    // Static nested classes
    static class Inner3{
        public static void main(String[] args) {
            staticMethod();
        }
    }

    // Anonymous Inner classes
    static Demo demo= new Demo(){
        public void show(){
            super.show();
            System.out.println("I am show in inner");
        }
    };

    class Inner4 implements Person{
        public void t(){
            System.out.println("I am interface in Inner class");
        }

    }

    Person person = new Person() {
        @Override
        public void t() {
            System.out.println("This is Interface in Outer Class");
        }
    };

    public static void main(String[] args) {
        demo.show();
    }

}
