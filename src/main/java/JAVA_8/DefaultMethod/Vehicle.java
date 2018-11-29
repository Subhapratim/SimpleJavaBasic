package JAVA_8.DefaultMethod;

public interface Vehicle {

    public int wheelNo();
    public String CategoryName();

    default void print(){
        System.out.println("This is Vehicle Interface.");
    }

}
