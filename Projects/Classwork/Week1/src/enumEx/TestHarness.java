package enumEx;

public class TestHarness {

 
    public static void main(String[] args) {
        Color1 c1 = Color1.RED;
        Color1 c2 = Color1.GREEN;
        Color1 c3 = Color1.RED;

        // Compare c1 and c2 using ==
        System.out.println(c1 == c2); // false

        // Compare c1 and c3 using ==
        System.out.println(c1 == c3); // true
        
        
        
        // Print the name and code of each color using a for loop
        for (Color2 c : Color2.values()) {
            printColor(c);
        }
    }
    
    
 // Define a method that prints the name and code of a color
    public static void printColor(Color2 color) {
        System.out.println("The color is " + color.getName() + " and its code is " + color.getCode());
    }
}

