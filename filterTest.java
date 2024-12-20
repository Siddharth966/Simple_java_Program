import java.util.*;
import java.util.stream.Collectors;

public class filterTest {
    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(12);
        numbers.add(4);
        numbers.add(23);
        numbers.add(51);

        System.out.println("the complete ArrayList is  :"+numbers);
        List <Integer> store = numbers.stream()
                .filter(num -> num % 2==0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("the sorted ArrayList is : "+store);
    }
}