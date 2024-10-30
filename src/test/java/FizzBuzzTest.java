
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testMultiple3() {
        FizzBuzz fb = new FizzBuzz();
        String actual = fb.runFizzBuzz(15);
        assertEquals("FizzBuzz", actual);
        assertEquals("Fizz", fb.runFizzBuzz(3));
        assertEquals("Fizz", fb.runFizzBuzz(27));
        assertEquals("29", fb.runFizzBuzz(29));
    }

    @Test
    public void testMultiple5() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBuzz", fb.runFizzBuzz(15));
        assertEquals("Buzz", fb.runFizzBuzz(5));
        assertEquals("Buzz", fb.runFizzBuzz(10));
        assertEquals("Buzz", fb.runFizzBuzz(20));
        assertEquals("FizzBuzz", fb.runFizzBuzz(30));
    }

    @Test void testMultiple3AND5() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBuzz", fb.runFizzBuzz(90));
    }

    @Test void testNoMultiple() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("98", fb.runFizzBuzz(98));
    }


}