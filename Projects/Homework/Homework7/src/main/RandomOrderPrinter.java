
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Random;

public class RandomOrderPrinter {
    public static void main(String[] args) {
        List<String> argList = Arrays.asList(args);
        Collections.shuffle(argList, new Random());

        // Using streams
        System.out.println("Using streams:");
        argList.stream().forEach(System.out::println);

        // Using enhanced for statement
        System.out.println("Using enhanced for statement:");
        for (String arg : argList) {
            System.out.println(arg);
        }
    }
}