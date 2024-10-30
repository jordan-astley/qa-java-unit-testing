
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



}
