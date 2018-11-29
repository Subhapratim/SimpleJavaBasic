package JAVA_8.DefaultMethod;

public interface FourWheeler extends Vehicle{
    public String name();
    default void print(){
        System.out.println("This is FourWheeler Interface.");
    }
    static void message(){
        System.out.println("Drive Safely.");
    }
}
