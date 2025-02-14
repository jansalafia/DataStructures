package template;

import java.util.ArrayList;
import java.util.Set;

public class YourRPNCalculator implements SimpleRPNCalculator {
	// don't change these...
	YourStack theStack = null;
	Set<String> ops;
	public YourRPNCalculator(YourStack stack) {
		theStack = stack;
	}

	
	@Override
	public String calculate(String inputString) {
		// this is probably helpful, but you can remove...
		ArrayList<String> tokens = RPNStringTokenizer.tokenize(inputString);
		
		if (tokens != null) {
			for (String token : tokens) {
				if (ops.contains(token)) {
					// do the math
				} else {
					// push the number
				}
			}
		}
		// here's the calculator logic!
		
		return null;
		
	}

}
