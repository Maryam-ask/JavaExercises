package Lesson9_Generic;

/**
 * Created by Maryam Askari
 * Date: 11/24/2020
 * Time: 7:02 PM
 * Project: IntelliJ IDEA
 */
public class GenericType<T> { // Generic classes
    public T t;

    public static void main(String[] args) {
        GenericType<String> gr = new GenericType<>();
        gr.setT("Salam");
        System.out.println(gr.getT());
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
