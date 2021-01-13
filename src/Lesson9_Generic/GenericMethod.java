package Lesson9_Generic;

/**
 * Created by Maryam Askari
 * Date: 11/24/2020
 * Time: 7:07 PM
 * Project: IntelliJ IDEA
 */
public class GenericMethod {

    public static <T> boolean isEqual(GenericType<T> g1, GenericType<T> g2) {
        if (g1.getT().equals(g2.getT())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        GenericType<String> gr1 = new GenericType<>();
        GenericType<String> gr2 = new GenericType<>();
        gr1.setT("salam");
        gr2.setT("salam");
        System.out.println(isEqual(gr1, gr2));
    }
}
