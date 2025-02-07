package Week2Class1;

import java.util.Arrays;

public class ArrayTest {
String[] stringArray = {"cat", "dog", "bird", "fish", "elephant"};
String[] stringArray2 = new String[5];

public void printArray() {
    System.out.println(Arrays.toString(stringArray));
}
public static void main(String[] args) {
    ArrayTest at = new ArrayTest();

    at.printArray();
}
}