import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import practice.SimpleCalculator;

public class simpleCalculatorTest {
    @Test
    public void twoplustwoequalsfour(){
        SimpleCalculator calculator = new SimpleCalculator();
        Assert.assertEquals(4, calculator.add(2, 2));
    }

}