package JAVA_8.Optional;

import java.util.Optional;

public class Summation {
    public int sum(Optional<Integer> a, Optional<Integer> b){

        System.out.println("First parameter is present : " + a.isPresent());
        System.out.println("Second parameter is present : " + b.isPresent());

        Integer value1 = a.orElse(new Integer(0));

        Integer value2 = b.get();
        return value1 + value2;

    }
}
