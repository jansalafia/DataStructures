import java.util.ArrayList;

public class YourArrayListStack implements YourStack {
    // YOU MUST USE THIS IMPLEMENTATION - just code the methods
    ArrayList<Integer> theStack = new ArrayList<>();

    @Override
    public void push(Integer i) {
        theStack.add(i);
    }

    @Override
    public Integer pop() {
        if (theStack.size() == 0) {
            return null;
        }
        return theStack.remove(theStack.size() - 1);
    }

    @Override
    public Integer size() {
        return theStack.size();
    }

}
