package JAVA_8.MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceClass {
    public void methodReference() {

        List<Integer> lists = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("The list is ");
        lists.forEach(System.out::println);

    }
}
