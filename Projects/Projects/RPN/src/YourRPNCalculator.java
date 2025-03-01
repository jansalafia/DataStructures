import java.util.ArrayList;

public class YourRPNCalculator implements SimpleRPNCalculator {
    // don't change these...
    YourStack theStack = null;

    public YourRPNCalculator(YourStack stack) {
        theStack = stack;
    }

    @Override
    public String calculate(String inputString) {
        // Tokenize the input string
        ArrayList<String> tokens = RPNStringTokenizer.tokenize(inputString);
        if (tokens == null) {
            return "Error: Invalid tokens in expression";
        }

        // Process each token
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                // Ensure there are at least two numbers on the stack to operate on
                if (theStack.size() < 2) {
                    return "Error: Not enough numbers on the stack for operation: " + token;
                }

                // Pop two operands from the stack
                int right = theStack.pop();
                int left = theStack.pop();
                int result = 0;

                // Perform the operation
                switch (token) {
                    case "+":
                        result = left + right;
                        break;
                    case "-":
                        result = left - right;
                        break;
                    case "*":
                        result = left * right;
                        break;
                    case "/":
                        if (right == 0) {
                            return "Division by zero error";
                        }
                        result = left / right;
                        break;
                }

                // Push the result back onto the stack
                theStack.push(result);
            } else {
                // Token is a number, push it onto the stack
                theStack.push(Integer.parseInt(token));
            }
        }

        // The final result should be the only item left on the stack
        if (theStack.size() != 1) {
            return "Error: Leftover Tokens. The stack should contain exactly one element after processing.";
        }
        return String.valueOf(theStack.pop());
    }
}
