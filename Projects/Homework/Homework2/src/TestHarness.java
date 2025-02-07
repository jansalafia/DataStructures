

public class TestHarness {

	public static void main(String[] s) {
		System.out.println("--");
		System.out.println("Testing INT in LL");
		System.out.println("--");
		TEST_int();

		System.out.println("--");
		System.out.println("Testing STRING in LL");
		System.out.println("--");
		TEST_String();

	}
	public static void TEST_int() {
		
		List<Integer> list = new ListImpl<>();
		list.display();
		list.insert(8);
		list.display();
		list.insert(6);
		list.insert(9);
		list.insert(11);
		list.insert(1);
		list.insert(8);
		list.insert(-7);
		list.insert(33);
		list.insert(-2);
		list.insert(9);
		list.display();
		
		System.out.println("\nTrying to remove 11");
		if (list.remove(11) == false)
			System.out.println("Error removing 11");
		else
			System.out.println("Success removing 11");
		System.out.println("\nTrying to remove 32");
		if (list.remove(32) == false)
			System.out.println("Error removing 32");
		else
			System.out.println("Success removing 32");
		System.out.println("\nTrying to remove -22");
		if (list.remove(-22) == false)
			System.out.println("Error removing -22");
		else
			System.out.println("Success removing -22");
		System.out.println("\nTrying to remove 99");
		if (list.remove(99) == false)
			System.out.println("Error removing 99");
		else
			System.out.println("Success removing 99");
		System.out.println("");
		list.display();
		System.out.println("\nTrying to remove -7");

		if (list.remove(-7) == false)
			System.out.println("Error removing -7");
		else
			System.out.println("Success removing -7");
		System.out.println("");
		
		list.display();
		
		
	}
	
	public static void TEST_String() {
		List<String> list2 = new ListImpl<>();
		list2.insert("hello");
		list2.insert("abacus");
		list2.insert("cello");
		list2.insert("zebra");
		list2.insert("barnyard");
		list2.insert("house");
		list2.insert("desktop");
		list2.insert("computer");
		list2.insert("keyboard");
		list2.display();
		list2.insert("desktop");
		list2.insert("computer");
		list2.insert("keyboard");
		list2.display();
	}
}
