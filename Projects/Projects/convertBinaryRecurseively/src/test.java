//DECIMAL TO BINARY CONVERSION ALGORITHM
// 1.Divide the number by 2.
// 2.Store the remainder (0 or 1).
// 3.Repeat until the quotient is 0.
// 4.Read the remainders in reverse order.

import java.util.Scanner;

public class test {

    public static String decimalToBinary(int userInt){
        if(userInt == 0){
            return "0";
        }
        else{
            return decimalToBinary(userInt/2) + userInt%2;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userInt = scanner.nextInt();
            
        System.out.println("The binary equivalent of " + userInt + " is " + decimalToBinary(userInt));

        
    }

    

}
