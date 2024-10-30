
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    // won't run without this
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int actual = calc.add(5,5);
        assertEquals(10, actual);
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        int actual = calc.subtract(7,5);
        assertEquals(2, actual);
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        int actual = calc.multiply(6,4);
        assertEquals(24, actual);
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        double actual = calc.divide(4,2);
        assertEquals(2.0, actual);
    }

    @Test
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        double actual = calc.divide(4,0);
        assertEquals(Double.POSITIVE_INFINITY, actual);
    }

    @Test
    public void testNegativeDivideByZero() {
        Calculator calc = new Calculator();
        double actual = calc.divide(-4,0);
        assertEquals(Double.NEGATIVE_INFINITY, actual);
    }
}
