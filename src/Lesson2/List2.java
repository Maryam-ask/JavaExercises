package Lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Maryam Askari
 * Date: 11/2/2020
 * Time: 4:34 PM
 * Project: IntelliJ IDEA
 */
public class List2 {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<String>();
        List<Integer> l2 = new ArrayList<Integer>();

        l1.add("a");
        l1.add("b");
        l1.add("c");
        l1.add("d");
        l1.add("e");

        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);

        List<String> result = new LinkedList<>();
        for (int i=0;i<l1.size(); i++){
            result.add(l1.get(i));
            result.add(String.valueOf(l2.get(i)));
        }
        System.out.print(result);
    }
}
