package ArrayStack;


public class StackArray<E> implements Stack<E> {

	private E[] elements;
	private int top;
	private int size;

	public StackArray(int size) {
		elements = (E[]) new Object[size];
		top = -1;
		this.size = size;
	}

	public boolean empty() {
		return top == -1;
	}

	public boolean full() {
		return top == size - 1;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() { 
		return top == -1;
	}

	@Override
	public E top() { 
		return elements[top];
	}

	@Override
	public void push(E element) {

		top++;
		elements[top] = element;

	}

	@Override
	public E pop() {
		E el = elements[top];
		top--;
		return el;
	}

}
