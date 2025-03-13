
public class SorterTest {

	final static int SIZE = 20000;
	final static int RANGE = 20000;
	static Sorter sorter = new Sorter();
	static java.util.Random random = new java.util.Random();
	static int[] array1 = new int[SIZE];

	public static void main(String[] args) {
		TEST_BUBBLE_SORT();
		TEST_MERGE_SORT();
		TEST_BINARY_SEARCH();
	}

	// run bubble sort with timing (PART I)
	public static void TEST_BUBBLE_SORT() {

		for (int i = 0; i < array1.length; i++)
			array1[i] = new Integer(random.nextInt(RANGE));
		sorter.setData(array1);
		System.out.println("Before Bubble Sort");
		if (SIZE <= 50)
			sorter.display();
		else
			sorter.display(20);
		long start = System.nanoTime();
		sorter.bubbleSort();
		long end = System.nanoTime();
		System.out.println("After Bubble Sort");
		if (SIZE <= 50)
			sorter.display();
		else
			sorter.display(20);
		double time = (end - start) / (double) 1000000000;
		System.out.printf("%nBubble Sort with %d Integers: %6.2f seconds%n%n", SIZE, time);
	}

	// run mergesort with timing (PART II)
	public static void TEST_MERGE_SORT() {
		for (int i = 0; i < array1.length; i++)
			array1[i] = new Integer(random.nextInt(RANGE));
		sorter.setData(array1);
		System.out.println("Before Mergesort");
		if (SIZE <= 50)
			sorter.display();
		else
			sorter.display(20);
		long start = System.nanoTime();
		sorter.mergesort();
		long end = System.nanoTime();
		System.out.println("After Mergesort");
		if (SIZE <= 50)
			sorter.display();
		else
			sorter.display(20);
		double time = (end - start) / (double) 1000000000;
		System.out.printf("%nMergsort with %d Integers: %6.2f seconds\n", SIZE, time);
	}

	// try binary search (PART III)
	public static void TEST_BINARY_SEARCH() {
		System.out.println("\n\nNow we will call binary search on some key values\n");
		int loc = -1;
		for (int i = 0; i < 25; i++) {
			if ((loc = sorter.binarySearch(i)) != -1)
				System.out.println(i + " was found in position " + loc);
			else
				System.out.println(i + " was not in the array " + loc);

		}
	}
}
