package template;

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
		theStack.remove(theStack.size() - 1);
		return null;
	}

	@Override
	public Integer size() {
		return theStack.size();
	}

}
