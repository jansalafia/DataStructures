

public interface Queue <T>
{
	public boolean empty();
	public boolean full();
	public boolean enqueue(T data);
	public T dequeue();	
	public void display();
}