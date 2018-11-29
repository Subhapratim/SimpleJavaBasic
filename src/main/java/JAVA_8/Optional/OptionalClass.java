package JAVA_8.Optional;

import java.util.Optional;

public class OptionalClass {
    public void optionalMethod(){

        Integer value1 = null;
        Integer value2 = new Integer('A');

        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.ofNullable(value2);

        Optional<Integer> b1 = Optional.of(value2);

        Summation summation = new Summation();
        int result = summation.sum(a,b);

        System.out.println("The result is "+result);

    }
}
