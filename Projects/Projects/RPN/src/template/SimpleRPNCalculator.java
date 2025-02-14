package template;

public interface SimpleRPNCalculator {
	public String calculate(String inputString);
	
	/*
	 * RPN (Reverse Polish Notation) is a postfix method of expression mathematical functions.
	 * It is traditionally used to eliminate the necessity of parenthesis by removing the
	 * order of operations and acting on operators as they occur.
	 * 
	 * Very simply, INFIX notation "1 + 1" is represented in POSTFIX notation as "1 1 +"
	 * Longer expressions may change radically.  "1 + 2 * 3" assumes an order of operations, 
	 * while in POSTFIX, "2 3 * 1 +" or "1 2 3 * +"
	 * 
	 * The calculator works as follows:
	 * if number, push to a stack
	 * if operator, pop two numbers, operate on them, and push the result
	 * if I hit an operator and there are not two numbers on the stack, it's a bad expression
	 * if I get to the end of the expression and there is not exactly one number on the stack,
	 *    it's a bad expression.
	 *    
	 * FOR YOUR IMPLEMENTATION, 30 points:
	 * 10 for making something that looks like it works - the input to output happening without a crash
	 * 10 for implementing LinkedListBasedStack
	 * 10 for implementing ArrayList
	 * 
	 * YOUR CALCULATOR ONLY NEEDS TO WORK FOR +, -, and *
	 * YOUR CALCULATOR ONLY NEEDS TO WORK ON INTEGERS.
	 * 
	 * 5 bonus points for working on Doubles (this is a gimme)
	 * 5 bonus points for implementing division / (this is deceptively hard, DO THIS LAST!)
	 * 
	 * 
	 */

}
