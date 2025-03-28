package Student;
import java.io.*;
import java.util.*;


public class Driver2 
{
	
	private static Student2 [] students = new Student2[100];
	private static Scanner kbd = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException
	{
		
		FileReader file = new FileReader("students.txt");		
		Scanner in = new Scanner(file);
				
		int i = 0;

			while (in.hasNextLine())
			{	
				String l1 = in.nextLine();
				String l2 = in.nextLine();
				String l3 = in.nextLine();
				int sem = in.nextInt();
				in.nextLine();
			
				students[i++] = new Student2(l1, l2, l3, sem);	
			}
	
		runMenu();
		
		System.out.printf("Program Finished");
		
	}
	
	public static void runMenu()
	{
		do {
		
		menu();

		String input = kbd.nextLine();
		int choice = Integer.parseInt(input);
		System.out.printf("%n");

		switch(choice)
		{
		case 1: displayAll(); break;
		case 2: displayIndex(); break;
		case 3: displayName(); break;
		case 4: displaySemStanding(); break;
		case 5: addNewStudent(); break;
		case 6: return;		
		}
		try { Thread.currentThread().sleep(500); }
		catch (InterruptedException ie) { }
		
		} while (true);
		
	}
	
	public static void menu()
	{
		System.out.printf("Choose an Option%n");
		System.out.printf("1 - Display All%n");
		System.out.printf("2 - Display by Index%n");
		System.out.printf("3 - Display Name%n");
		System.out.printf("4 - Display by Semester%n");
		System.out.printf("5 - Add a Student%n");
		System.out.printf("6 - Quit%n");		
	}
	
	public static void displayAll()
	{
		int i = 0;
		while (students[i] != null) {
			System.out.printf("%s%n%s%n", students[i++],"-------------------");
		}
		System.out.println("Students Displayed: " + i);
	}
	
	public static void displayIndex()
	{
		System.out.printf("Enter the Index ");
		String index = kbd.nextLine();
		int choice = Integer.parseInt(index);
		
		System.out.printf("%s%n%s%n", students[choice],"-------------------");
		System.out.println("Students Displayed: 1");
	}
	
	
	public static void displayName()
	{
		System.out.printf("Enter the Name ");
		String name = kbd.nextLine();
		
		int i = 0;
		int count = 0;
		while (students[i] != null)
		{
			if (students[i].getName().toLowerCase().contains(name.toLowerCase()))
			{
				System.out.printf("%s%n%s%n", students[i],"-------------------");
				count++;
			}
			i++;
		}	
		System.out.println("Students Displayed: " + count);
	}

	public static void displaySemStanding(){				//Display students with a semester standing (sem) equal to a value you provide
		System.out.printf("Enter the semester you want to search by: ");
		int semInt = Integer.parseInt(kbd.nextLine());

		int i = 0;								//Loop through the students array and print out the students with the semester standing you provided
		int count = 0;
		while (students[i] != null) {
			if (students[i].getSem() == semInt) {
				System.out.printf("%s%n%s%n", students[i], "-------------------");
				count++;
			}
			i++;
		}
		System.out.println("Students Displayed: " + count);
	}

	public static void addNewStudent(){
		System.out.printf("Enter name: ");
		String name = kbd.nextLine();
		System.out.printf("Enter current class: ");
		String status = kbd.nextLine();
		System.out.printf("Enter current major: ");
		String major = kbd.nextLine();
		System.out.printf("Enter current semester: ");
		String sem = kbd.nextLine();

		int i = 0;							//Loop through the students array and find the first null value in array
		while (students[i] != null) {
			i++;
		} 

		students[i] = new Student2(name, status, major, Integer.parseInt(sem));		//Create a new Student2 object and add it to the students array
		System.out.printf("Student " + name + " added to the list%n");
	}


}