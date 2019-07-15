import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }


    @Test
    public void addsNumbers(){
        assertEquals(4.0, calculator.add(2.00, 2.00), 0.00);
    }

    @Test
    public void subtractsNumbers(){
        assertEquals(1.00, calculator.subtract(5.00, 4.00), 0.00);
    }

    @Test
    public void multipliesNumbers(){
        assertEquals(25.00, calculator.multiply(5.00, 5.00), 0.00);
    }

    @Test
    public void dividesNumbers(){
        assertEquals(5.00, calculator.divide(10.00, 2.00), 0.00);
    }
}


//Calculator
//        Create a Calculator class. This should have functions for Add, Subtract, Multiply and Divide,
// each taking in two doubles to perform the calculations on.