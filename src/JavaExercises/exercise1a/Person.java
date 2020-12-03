package JavaExercises.exercise1a;

/**
 * Created by Maryam Askari
 * Date: 12/3/2020
 * Time: 3:15 PM
 * Project: IntelliJ IDEA
 */
public class Person {
    private String name;
    private String address;
    private int age;

    public Person(){}

    public Person(String name,String address,int age){
        this.name=name;
        this.address=address;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
