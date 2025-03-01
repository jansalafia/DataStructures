package Queue;

//array based Q impl
public class QueueImpl<T> implements Queue<T> {
	int LENGTH = 6;
	T[] arr;
	int size = 0;

	public QueueImpl() {
		arr = (T[]) new Object[LENGTH];
	}
	
	@Override
	public boolean isFull() {
 		if (arr[LENGTH - 1] != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {

		if (arr[0] == null) {
			return true;
		}
		return false;
	}

	public void enQueue(T element) {
		if (isFull()) {
			System.out.println("sorry, full queue");
		} else if (isEmpty()) {
			arr[0] = element;
			size++;
		} else {
			//shift each to the right
			for (int i = size; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			//incoming now last element in FIFO queue
			arr[0] = element;
			size++;
		}

	}

	@Override
	public T deQueue() {
		
		if(size == 0) {
			System.out.println("Empty Q..");
			return null;
		}
		return arr[--size];
	 
	}

	@Override
	public void display() {
	 
		for(int i = size-1; i >=0; i--)
			System.out.println("q element: " + arr[i]);
	}

	@Override
	public T peek() {
 		T result = null;
		result = arr[size-1];
 		return result;

	}

}
