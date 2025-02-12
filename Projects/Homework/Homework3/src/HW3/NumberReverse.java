import java.util.Scanner;

public class NumberReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.print("Enter an integer between 8-15 digits. Enter '-1' to quit: ");
            long inputNumber = scanner.nextLong();

            if (inputNumber == -1) {                                        //Exit the program if user enters -1
                break;
            }

            System.out.println("You entered: " + inputNumber);

            long doubleNumber = inputNumber * 2;
            System.out.println("Doubled the value is: " + doubleNumber);

            StackArray stack = new StackArray(15);              //Max len of number is 15 digits

            while (doubleNumber > 0) {                              //Push digits of doubleNumber to stack
                long digit = doubleNumber % 10;
                int digitInt = (int) digit;                         //Convert long to int using casting so push method can accept it
                stack.push(digitInt);
                doubleNumber /= 10;
            }

            long result = 0;
            int power = 0;

            while (!stack.empty()) {                                //Pop digits from stack and reverse the number
                int digit = stack.pop();                            
                result += digit * Math.pow(10, power);            
                power++;
            }

            System.out.println("Result of reverse of the double is: " + result);
        }

        scanner.close();
    }
}
