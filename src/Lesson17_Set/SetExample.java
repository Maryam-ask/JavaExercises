package Lesson17_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Maryam Askari
 * Date: 12/23/2020
 * Time: 9:50 PM
 * Project: IntelliJ IDEA
 */
public class SetExample {
    public static void main(String[] args) {
        // Set maghadire tekrari ra ghabol nemikonad.
        
        //Set<String> set = new HashSet<>(5); // inja mitavanim size set ra bezarim vali age bishtar vared shavad khodash automat bishtar mikonad
        Set<String> set = new HashSet<>(5);
        // baraye ezafe kardan be set:
        set.add("a");
        set.add("a"); // agar bezaje "a" ---> " a" bezarim yek meghdare jadid ast va digar tekrari nist.
        set.add("b");

        System.out.println("set.size() : "+set.size()); // maghadire tekrari ra hesab nemikonad. dar in sorat size=2
        System.out.println(set);

        for (String s : set){ // baraye neshan dadane maghadire set mitavan az for-each estefade kard.
            System.out.println(s);
        }
         /* dar set ma shomareye khane hara nadarim
        pass nemitavan az halgheye fore adad dar estefade kard ba moteghayere i*/


        // Mitavan maghadire dakhele set ra niz ba halgheye Iterator nevesht
        Iterator iterator = set.iterator();
        if (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        while (iterator.hasNext()){ // hasNesxt() ---> Meghdare boolean bar migardanad
            System.out.println(iterator.next()); // next() ---> khode meghdar ra barmigardanad.
        }
    }
}
