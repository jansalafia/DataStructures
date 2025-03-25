 
import java.util.ArrayList;
import java.util.List;

import main.App;
 

/**
 * App to create & test method to find the maximal element in a range of a list. 
 * -- Tested with Lists of Strings, Integers & User defined object (U) . 
 * 
 * @author jkramer
 *
 */

public class App {
 
	
	//TODO - create three lists: Strings, Integers, UserDefinedTypes (U)

	List<String> stringList = new ArrayList<>();
	List<Integer> integerList = new ArrayList<>();
	List<U> userDefinedTypeList = new ArrayList<>();
	
	
 	public static void main(String[] args){
		App app = new App();
		app.loadErUp();
		app.testGenericMaxStuff();
	}
	 
	private void testGenericMaxStuff(){

		String stringMax = max(stringList, 0, 4);
		System.out.println("String List Compare Result: " + stringMax);

		Integer integerMax = max(integerList, 0, 4);
		System.out.println("Integer List Compare Result: " + integerMax);

		U uMax = max(userDefinedTypeList, 0, 4);
		System.out.println("User Defined List Compare Result: " + uMax.getName() + ", " + uMax.getAge());

		//TODO: for each type of list, get the max between a given range & print.  i.e: 

		/*
		 * 	2024-01-03 18:27:43 DEBUG App:31 - String List Compare Result: zeowl
		 *	2024-01-03 18:27:43 DEBUG App:34 - Integer List Compare Result: 10000
		 *	2024-01-03 18:27:43 DEBUG App:37 - User Defined List Compare Result: sally, 103
		 */
		 
 	}
	 	
	public static <T extends Comparable<T>> T max(List<T> list, int begin, int end) {	
		T max = list.get(begin);							//Assign the first element as the max
		
		for (int i = begin + 1; i <= end; i++) {			//Loop from begin+1 to end to find the max element
			T current = list.get(i);
			if (current.compareTo(max) > 0) {				//Compare the current element with the max element
				max = current;
			}
		}
		
		return max;
	}
 

	private void loadErUp(){

		// load a list of strings
		stringList.add("meowl");
		stringList.add("yowl");
		stringList.add("zeowl");
		stringList.add("bear");
		stringList.add("reel");
		stringList.add("gobblygook");
		
		integerList.add(3);
		integerList.add(2);
		integerList.add(44);
		integerList.add(222);
		integerList.add(10000);
		integerList.add(12);
	
		userDefinedTypeList.add(new U("rob", 49));
		userDefinedTypeList.add(new U("sally", 103));
		userDefinedTypeList.add(new U("tim", 6));
		userDefinedTypeList.add(new U("marty", 37));
		userDefinedTypeList.add(new U("pete", 21));

	}
}	
 


class U implements Comparable<U>{

	String name;
	Integer age; 
	
	public String getName(){
		return name;
	}

	public Integer getAge(){ 
		return age;
	}

	public U(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
		
	@Override
	public int compareTo(U u) {
        return this.age.compareTo(u.getAge()); 
	}
}
 


