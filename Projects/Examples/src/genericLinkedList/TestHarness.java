package genericLinkedList;
public class TestHarness {

	public static void main(String args[]) {

		List<Integer> l = new LinkedList<>();

		TEST_ADD_INT(l);
		System.out.println("");
		TEST_DELETE_INT(l);
		
		System.out.println("");
		System.out.println("");
		

		List<String> l2 = new LinkedList<>();
		TEST_ADD_STRING(l2);
		System.out.println("");
		TEST_DELETE_STRING(l2);
		
		
	}

	public static void TEST_ADD_INT(List<Integer> l) {

		l.add(32);
		l.add(105);
		l.add(35);
		l.add(39);
		l.add(34);
		l.display();

	}

	public static void TEST_DELETE_INT(List<Integer> l) {
		l.delete(39);
		l.display();
	}
	
	
	public static void TEST_ADD_STRING(List<String> l) {

		l.add("sam");
		l.add("pam");
		l.add("will");
		l.add("jill");
		l.add("tam");
		l.display();

	}

	public static void TEST_DELETE_STRING(List<String> l) {
		l.delete("jill");
		l.display();
	}


}
