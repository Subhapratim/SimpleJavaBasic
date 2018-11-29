package JAVA_8.DefaultMethod;

public class Bike implements Vehicle{
    @Override
    public int wheelNo() {
        return 2;
    }

    @Override
    public String CategoryName() {
        return "Bike";
    }
}
