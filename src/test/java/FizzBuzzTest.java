
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String actual = fb.runFizzBuzz(15);
        assertEquals("FizzBuzz", actual);

        assertEquals("Fizz", fb.runFizzBuzz(3));
        assertEquals("Buzz", fb.runFizzBuzz(5));
        assertEquals("Buzz", fb.runFizzBuzz(10));
        assertEquals("Buzz", fb.runFizzBuzz(20));
        assertEquals("FizzBuzz", fb.runFizzBuzz(30));
        assertEquals("Fizz", fb.runFizzBuzz(27));
        assertEquals("29", fb.runFizzBuzz(29));
    }

}