

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlackjackTest {

    @Test
    public void testPlayer1Win() {
        Blackjack blackjack = new Blackjack();
        assertEquals(20, blackjack.compareNumbers(20, 19));
    }

    @Test
    public void testPlayer2Win() {
        Blackjack blackjack = new Blackjack();
        assertEquals(2, blackjack.compareNumbers(1, 2));
    }

    @Test
    public void testBothLose() {
        Blackjack blackjack = new Blackjack();
        assertEquals(0, blackjack.compareNumbers(23, 100));
    }

    @Test
    public void winByDefault() {
        Blackjack blackjack = new Blackjack();
        assertEquals(1, blackjack.compareNumbers(1, 30));
    }

}
