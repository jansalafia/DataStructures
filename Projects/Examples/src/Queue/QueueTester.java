package Queue;

public class QueueTester {

	public static void main(String[] args) {
		Queue theQueue = new QueueImpl();
		runTests(theQueue);

	}

	public static void runTests(Queue q) {

		// try to delete element from the queue
		// currently queue is empty
		// so deletion is not possible
		// q.deQueue();

		// insert elements to the queue
		q.enQueue("sam");
		q.enQueue("pam");
		q.enQueue("will");
		q.enQueue("jill");

		// queue enqued
		q.display();
		
		System.out.println("peeking: " + q.peek());
		q.display();

		// deQueue removes element entered first i.e. 1
		String removed = (String) q.deQueue();
		System.out.println("element dequeued: " + removed);
		
		System.out.println("peeking: " + q.peek());

		// Now we have just 3 elements
		q.display();

	}
}
