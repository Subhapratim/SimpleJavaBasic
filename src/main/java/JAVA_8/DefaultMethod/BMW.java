package JAVA_8.DefaultMethod;

public class BMW implements Vehicle, FourWheeler {
    @Override
    public String name() {
        return "BMW 7 Serious.";
    }

    @Override
    public int wheelNo() {
        return 4;
    }

    @Override
    public String CategoryName() {
        return "Sedan Class Car.";
    }

    public void specs() {
        System.out.print("FOUR WHEELER DEFAULT METHOD : ");
        FourWheeler.super.print();
        System.out.print("FOUR WHEELER STATIC METHOD : ");
        FourWheeler.message();
        System.out.println("This is a BMW.");
    }
}
