
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args){
        List<String> names = Arrays.asList(
                "Joe",
                "Sally",
                "John",
                "Sue"
        );

        List<String> upperCase = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("Names uppercase: ");

        for(String name: upperCase){
            System.out.println(name);
        }

        System.out.println("For each stream shorthand:");
        upperCase.stream().forEach(System.out::println);

        List<String> jNames = names.stream()
                .filter(name -> name.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println("For each stream J names: ");
        jNames.stream().forEach(System.out::println);

        System.out.println("With Integers:");
        List<Integer> numbers =  Arrays.asList(5,10,15,20);

        numbers.stream().forEach(System.out::println);

        System.out.println("Greater than 15");
        numbers.stream().filter(num -> num > 15).forEach(System.out::println);

        int sum = numbers.stream().reduce(0,(total,next) -> total + next);

        System.out.println("The sum of the numbers list is: " +sum);



    }
}
