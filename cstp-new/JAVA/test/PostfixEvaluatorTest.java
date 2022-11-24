
import static org.junit.Assert.*;

import A1.MalformedExpressionException;
import A1.PostfixEvaluator;
import org.junit.Test;

public class PostfixEvaluatorTest {

	// Implement a sufficient number of tests to have
	// reasonable confidence in the correctness of your
	// PostfixEvaluator implementation.
	
	@Test
	public void test1() throws MalformedExpressionException {
		double num = new PostfixEvaluator("2 2 +").eval(); // 4
		System.out.println(num);
	}

	@Test
	public void test2() throws MalformedExpressionException {
		double num = new PostfixEvaluator("-2.5 2 +").eval(); // -0.5
		System.out.println(num);
	}

	@Test
	public void test3() throws MalformedExpressionException {
		double num = new PostfixEvaluator("2 + 2 2 / +").eval(); // malfunction
		System.out.println(num);
	}
}


