package LinkedStack;
 
public class StackDriver 
{
  public static void main(String[] args)
  {
    StackInterface<String> test;
    test = new LinkedStack<String>();    
    
    test.push("my");
    test.push("dog");
    test.push("has");
    test.push("fleas");
    
    
    //note, in this LinkedStack implementation top returns the top element but doesn't remove
    //pop removes the element but doesn't return ( hence both are needed to iterate thru the stack )
    
    System.out.println(" top: " + test.top());
    test.pop();
    
    System.out.println(" top: " + test.top());
    System.out.println(" top: " + test.top()); 

  }
}