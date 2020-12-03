package JavaExercises.exercise1a;

/**
 * Created by Maryam Askari
 * Date: 12/3/2020
 * Time: 3:20 PM
 * Project: IntelliJ IDEA
 */
public class Car {

    private String registeringNumber;
    private String model;
    private String mark;
    private CarOwner owner;

    public Car(){}

    public Car(String registeringNumber,String model,String mark,CarOwner owner){
        this.registeringNumber=registeringNumber;
        this.model=model;
        this.mark=mark;
        this.owner=owner;
    }

    public String getRegisteringNumber() {
        return registeringNumber;
    }

    public void setRegisteringNumber(String registeringNumber) {
        this.registeringNumber = registeringNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public CarOwner getOwner() {
        return owner;
    }

    public void setOwner(CarOwner owner) {
        this.owner = owner;
    }
}
