package JavaExercises.exercise1a;

/**
 * Created by Maryam Askari
 * Date: 12/3/2020
 * Time: 5:51 PM
 * Project: IntelliJ IDEA
 */
public class Main {

    public void buyCar(Car car, CarOwner owner){
        System.out.println("Starting method ");
        car.setOwner(owner);
        System.out.println("New car owner:"+car.getOwner().getName());
    }

    public static void main(String[] args) {
        //CarOwner m = (CarOwner) new Person("Maryam","Täby",26);
        CarOwner m = new CarOwner();
        m.setName("M");

        Car v= new Car("123tyb","Xc40","Volvo",m);
        //CarOwner n= (CarOwner) new Person("P","a",20);
        CarOwner n= new CarOwner();
        n.setName("n");
        Main ma = new Main();
        ma.buyCar(v,n);
    }
}
