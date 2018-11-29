package JAVA_8.DefaultMethod;

public class DefaultMethodClass {
    public void defaultMethod(){

        Bike bike = new Bike();
        System.out.print("VEHICLE DEFAULT METHOD : ");
        bike.print();

        FourWheeler car = new BMW();
        ((BMW) car).specs();

    }
}
