package JAVA_8.Streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsClass {
    public void streamsMethod(){
        List<String> lists = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        System.out.println("Lists : "+lists);

        int emptyCount = (int) lists.stream().filter(list -> list.isEmpty()).count();
        System.out.println("Empty Strings : " + emptyCount);

        int count = (int) lists.stream().filter(s -> s.length() == 3).count();
        System.out.println("Strings of length 3 : " + count);

        List<String> filtered = lists.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List : " + filtered);

        String mergedString = lists.stream().filter(str -> !str.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String : " + mergedString);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        System.out.println("Numbers : "+numbers);

        List<Integer> squaresList = numbers.stream().map(i -> (i*i)).distinct().collect(Collectors.toList());
        System.out.println("Squares List: " + squaresList);

        IntSummaryStatistics stats = numbers.stream().mapToInt(value -> value).summaryStatistics();
        System.out.println("Highest Number in List : " + stats.getMax());
        System.out.println("Lowest Number in List : " + stats.getMin());
        System.out.println("Sum of All Numbers : " + stats.getSum());
        System.out.println("Average of All Numbers : " + stats.getAverage());

        System.out.println("Random Numbers : ");
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }
}
