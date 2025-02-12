public class StackArray 
{

	private int [] elements;
	private int top;
	private int size;
	
	public StackArray (int size)
	{
		elements = new int[size];
		top = -1;
		this.size = size;
	}
	
	public boolean empty()
	{
		return top == -1;
	}
	
	public boolean full()
	{
		return top == size - 1;
	}
	
	public boolean push(int el)
	{
		if (full())
			return false;
		else
		{
			top++;
			elements[top] = el;
			return true;
		}
	}
	
	public int pop()
	{
		int el = elements[top];
		top--;
		return el; 
	}
	
	
}
