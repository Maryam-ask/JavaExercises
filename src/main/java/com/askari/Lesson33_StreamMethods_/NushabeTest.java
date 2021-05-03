package com.askari.Lesson33_StreamMethods_;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Maryam Askari
 * Date: 3/13/2021
 * Time: 7:14 PM
 * Project: IntelliJ IDEA
 */
public class NushabeTest {


    public static void main(String[] args) {

        List<Nushabe> list = new ArrayList<>();
        list.add(new Nushabe(1, 10, "Orange", "porteghal", "pepsi"));
        list.add(new Nushabe(2, 15, "Black", "nushabei", "canada dry"));
        list.add(new Nushabe(3, 20, "Red", "Angur", "pepsi"));
        list.add(new Nushabe(4, 5, "Black", "nushabei", "coca"));

        testMap(list);
        testFilter(list);
        testSkipLimit(list);
        testAnyMach(list);
        testFindAny(list);
        testSort(list);
        testSummery(list);
        testGrouping(list);



        //  Tamrinha:
        testMap1(list);  // Tamrin 1
        testSkipFilter(list);  //  Tamrin 2
        testSort1(list);   // Tamrin 3 ???????
        testGroup1(list);  // Tamrin 4

    }

    public static void testMap(List<Nushabe> list) {
        List<String> result = list.stream().map(Nushabe::getBerand).collect(Collectors.toList());
        for (String s : result) {
            System.out.println("testMap : " + s);
        }
    }

    /*
    Tamrin 1 : Map Color + weight dar yek khat
     */

    public static void testMap1(List<Nushabe> list) {
        List<String> result = list.stream().map(n-> n.getWeight()+" "+n.getColor()).collect(Collectors.toList());
        for (String s : result){
            System.out.println(s);
        }
    }

    public static void testFilter(List<Nushabe> list) {
        List<Nushabe> result = list.stream().filter(nushabe -> nushabe.getColor().equals("Black")).collect(Collectors.toList());
        System.out.println("testFilter : " + result.size());
    }

    public static void testSkipLimit(List<Nushabe> list) {
        List<Nushabe> result = list.stream().skip(2).limit(3).collect(Collectors.toList());
        System.out.println("testSkipLimit : " + result.size());
    }

    /*
    Tamrin 2 : nushabehara filter konad canada dry va az on list ma khoneye aval ra nemikhaiem va baghye khone hara bede.
     */

    public static void testSkipFilter(List<Nushabe> list) {
        List<Nushabe> result = list.stream().filter(n -> n.getBerand().equals("canada dry")).
                skip(1).collect(Collectors.toList());
        System.out.println("testSkipfilter : " + result.size());
    }

    public static void testAnyMach(List<Nushabe> list) {
        boolean isMach = list.stream().anyMatch(n -> n.getColor().equals("Black"));
        System.out.println("TestAnyMach : " + isMach);
    }

    public static void testFindAny(List<Nushabe> list) {
        Optional<Nushabe> any = list.stream().filter(n -> n.getColor().equals("Black")).findAny();
        if (any.isPresent()) {
            System.out.println("TestFIndAny : " + any.toString());
            System.out.println(any.get().getId());
        }
    }

    public static void testSort(List<Nushabe> list) {
        List<Nushabe> result = list.stream().sorted(Comparator.comparing(Nushabe::getId)).collect(Collectors.toList());
        for (Nushabe n : result) {
            System.out.println("testSort : " + n.getId());
        }
    }

    /*
    Tamrin 3: Lambda Comparator ra baraye Sort benevis.
     */
    public static void testSort1(List<Nushabe> list) {
        List<Nushabe> result = list.stream().sorted((Nushabe n1, Nushabe n2) -> n1.getColor().compareTo(n2.getColor())).
                collect(Collectors.toList());
        System.out.println("********** testSort1 ********'");
        for (Nushabe n : result) {
            System.out.println(n.getColor());
        }
    }

    public static void testSummery(List<Nushabe> list) {
        // count id ya weight
        long result = list.stream().mapToLong(Nushabe::getWeight).sum();
        System.out.println("testSummery : " + result);

        LongSummaryStatistics longSummaryStatistics = list.stream().mapToLong(Nushabe::getId).summaryStatistics();
        System.out.println("longSummaryStatistics.getSum() : " + longSummaryStatistics.getSum());
        System.out.println("longSummaryStatistics.getCount() : " + longSummaryStatistics.getCount());
    }

    public static void testGrouping(List<Nushabe> list) {
        Map<String, List<Nushabe>> result = list.stream()
                .collect(
                        Collectors.groupingBy
                                (Nushabe::getBerand, Collectors.toList()));
        for (Map.Entry<String, List<Nushabe>> entry : result.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().size());
        }

    }

        /*
        Tamrin 4 : Yek group barasase brand va color besaze.
        */
    public static void testGroup1(List<Nushabe> list){

        Map<String,List<String>> result = list.stream().collect
                (Collectors.groupingBy(Nushabe::getBerand,Collectors.mapping((Nushabe::getColor),Collectors.toList())));

        for (Map.Entry<String,List<String>> entry : result.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }
}



