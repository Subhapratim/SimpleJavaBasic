package JAVA_8.FunctionalInterFace;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaceClass {
    public void functionalInterfaceMethod(){

        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5);
        
        System.out.print("Print all numbers: ");
        eval(lists, n->true);

        System.out.print("\nPrint even numbers: ");
        eval(lists, n-> n%2 == 0 );

        System.out.print("\nPrint numbers greater than 3: ");
        eval(lists, n-> n > 3 );

    }

    private void eval(List<Integer> lists, Predicate<Integer> predicate) {

        for(Integer n: lists) {
            if(predicate.test(n)) {
                System.out.print(n + " ");
            }
        }

    }
}
