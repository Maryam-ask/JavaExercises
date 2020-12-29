package Lesson17_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by Maryam Askari
 * Date: 12/23/2020
 * Time: 10:08 PM
 * Project: IntelliJ IDEA
 */
public class SetExample2 {
    public static void main(String[] args) {
        // Barresie method haye Set.

        /*Integer []i = {1,2,3,4,5,5};
        Set <Integer> set1 = new HashSet<>(Arrays.asList(i));*/

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 3, 6)); // mitavan do khate bala ra dar yek khat nevesht.
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 5, 4, 3, 6));
        //Set <Integer> set2 = new HashSet<>(Arrays.asList(new Integer[]{3,6,7}));
        Set <Integer> set3 = new HashSet<>();

        while (set3.size() != 10){
            Random random = new Random();
            set3.add(random.nextInt());
        }

        System.out.println("set1.size() : " + set1.size());
        for (Integer ii : set1) {
            System.out.println(ii);
        }

        if (set1.contains(5)) { // agar shamele 5 bood.
            System.out.println("You are win!");
        } else {
            System.out.println("You lose!");
        }

        // Union ( ejtema)
        set1.addAll(set2); // tamame set2 ra dar set1 mirizad va maghadire tekrari ra hazf mikonad.
        System.out.println(set1);

        // intersection
        System.out.println(set1.retainAll(set2)); // agar maghadire moshabeh dashte bashand return---> false

        for (Integer t : set1) {
            for (Integer tt : set2) {
                if (t == tt) {
                    System.out.println(t);
                }
            }
        }

           /* set1.removeAll(set2);
            System.out.println(set1);*/

        set2.removeAll(set1);
        System.out.println(set2);



    }
}
