package ArrayStack;


public class TestHarness {

	public static void main(String[] args) {

		TEST_Int();
		TEST_String();
		 

	}
	
	public static void TEST_Int() {
		
		Stack<Integer> intStack = new StackArray<>(10);
		intStack.push(5);
		intStack.push(3);
		System.out.println("size: " + intStack.size());				//this aint right how do we fix?
		System.out.println("popped: " + intStack.pop());
		System.out.println("isEmpty: " + intStack.isEmpty());
			
		
	}

	public static void TEST_String() {
		
		Stack<String> s = new StackArray<>(10);
		s.push("This");
		s.push("that");
		s.push("the other thing");
		System.out.println("popped: " + s.pop());
		System.out.println("popped: " + s.pop());
		
		s.push("another thing");
		System.out.println("popped: " + s.pop());
		
	}
	
}
