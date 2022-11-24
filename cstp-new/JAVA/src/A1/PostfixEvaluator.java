package A1;

import java.util.Objects;
import java.util.Stack;

/**
 * 
 * 
 * This class contains a method to evaluate an arithmetic expression
 * that is in Postfix notation (or Reverse Polish Notation).
 * See <a href="https://en.wikipedia.org/wiki/Reverse_Polish_notation">Wikipedia</a>
 * for details on the notation.
 *
 */
public class PostfixEvaluator {
	
	private String arithmeticExpr;
	
	/**
	 * This is the only constructor for this class.
	 * It takes a string that represents an arithmetic expression
	 * as input argument.
	 * 
	 * @param expr is a string that represents an arithmetic expression 
	 * <strong>in Postfix notation</strong>.
	 */
	public PostfixEvaluator( String expr ) {
		arithmeticExpr = expr;
	}
	
	/**
	 * This method evaluates the arithmetic expression that 
	 * was passed as a string to the constructor for this class.
	 * 
	 * @return the value of the arithmetic expression
	 * @throws MalformedExpressionException if the provided expression is not
	 * 	a valid expression in Postfix notation
	 */
	public double eval( ) throws MalformedExpressionException {
		// TODO: Implement this method.

		Stack<Double> stack = new Stack<>();

		// The code provided here is for illustration only, and
		// can be deleted when you write your implementation.

		// Using a stack makes it very simple to evaluate the
		// arithmetic expression.
		// See http://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
		
		// Use the Scanner to get the elements (tokens) in the
		// arithmetic expression.
		
		Scanner scanner = new Scanner(arithmeticExpr);
		Token currToken;

		//stack.push(currToken.getValue());
		try {
		while (!scanner.isEmpty()) {

			currToken = scanner.getToken();

			if (currToken.isDouble()) {
				stack.push(currToken.getValue());
			} else if (Objects.equals(currToken.toString(), "+")) {
				stack.push(stack.pop() + stack.pop());
			} else if (Objects.equals(currToken.toString(), "-")) {
				double num1 = stack.pop();
				double num2 = stack.pop();
				stack.push(num2 - num1);
			} else if (Objects.equals(currToken.toString(), "*")) {
				stack.push(stack.pop() * stack.pop());
			} else if (Objects.equals(currToken.toString(), "/")) {
				double num3 = stack.pop();
				double num4 = stack.pop();
				stack.push(num4 / num3);
			}

			scanner.eatToken();
		}
		} catch (Exception e) {
			throw new MalformedExpressionException("TRY AGAIN BITCH");
		}


		// now process the token, etc.
		// You should read the implementation of the Token class
		// to determine what methods you can and should use.
		
		// It is sufficient to support the four basic operations:
		// addition, subtraction, multiplication & division.
		
		return stack.pop();
	}
	
}
