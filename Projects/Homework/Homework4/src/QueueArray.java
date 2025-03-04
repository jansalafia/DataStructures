public class QueueArray<T> implements Queue<T> {
	private int front;
	private int rear;
	private int MAX_SIZE = 100;
	private T[] data;
	private int numElements = 0;

	public QueueArray() {
		data = (T[]) new Object[MAX_SIZE];
		front = 0;
		rear  = 0;
	}
	
        @Override
	public boolean empty() {
		if (numElements == 0) {
			return true;
		}
		else {
			return false;
		}

	}

        @Override
	public boolean full() {
		if (numElements == MAX_SIZE) {
			return true;
		}
		else {
			return false;
		}
	
	}

        @Override
	public boolean enqueue(T el) {

	 	if (full()) {
			return false;
		}

		else if (empty()) {
			data[0] = el;
			front = 0;
			rear = 0;
			numElements++;
			return true;
		}

		else {
			rear = bump(rear);
			data[rear] = el;
			numElements++;
		}
		return true;

	}

        @Override
	public T dequeue() {

	    if (empty()) {
	        System.out.println("Queue is empty");
	        return null;
	    }

	    T temp = data[front];

	    if (numElements == 1) {
	        front = -1;
	        rear = -1;
	    } else {
	        front = bump(front);
	    }

	    numElements--;
	    return temp;
	}

	public void display() {
		// if queue is empty, print only [ ]
		if (empty())
			System.out.println("[ ]");
	
		else if (numElements == 1) {
			System.out.print("[ " + data[front] + " ]");
		}
		else if (front == rear){
		System.out.print("[ " + data[front] + " ]");
		}

		else {

			System.out.print("[ ");

			int i = front;
			while (true) {
				System.out.print(data[i] + " ");

				if (i == rear)
					break;
				i++;
				
				if(numElements ==0)
					break;
			}
			System.out.print("] ");
			System.out.println(" ");

		}

	}

	private int bump(int index) {
		return (index + 1) % data.length;
	}

	public static void main(String[] arg) {

		System.out.printf("Helo World%n");

		Queue<Integer> q = new QueueArray<>();
		q.enqueue(5);
		q.enqueue(4);
		q.enqueue(55);
		q.enqueue(12);
		q.enqueue(7);
		q.display();
		q.dequeue();
		q.display();
		q.enqueue(3);
		q.display();
	}
}
