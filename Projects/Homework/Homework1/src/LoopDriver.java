import java.io.*;
import java.util.*;

public class LoopDriver 
{

	public static void main(String[] args) throws FileNotFoundException
	{
		
		// connect to file and create a scanner to read from file
		FileReader file = new FileReader("students.txt");	
		Scanner in = new Scanner(file);
		
		PrintStream out = new PrintStream("students.out.txt");
		
		// read students from file and print them out to screen

		while (in.hasNextLine())
		{
			String l1 = in.nextLine();
			String l2 = in.nextLine();
			String l3 = in.nextLine();
			int sem = in.nextInt();
			in.nextLine();
		
			Student s1 = new Student(l1, l2, l3, sem);	
			System.out.println(s1);
			out.println(s1 + " ***");
			
			
		}
		System.out.println("Program Finished");		
	}
}

