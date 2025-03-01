package Queue;

public interface Queue<T> {

	 boolean isFull() ;
	 boolean isEmpty();
	 
	 // insert elements to the queue
	  void enQueue(T element);
	  
	  // delete element from the queue
	  T deQueue();
	  
	  // display element of the queue
	  void display();
	  
	  //display 'first' element 
	  public T peek();
	
}
