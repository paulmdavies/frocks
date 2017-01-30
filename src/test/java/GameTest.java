import junit.framework.TestCase;

import java.util.Arrays;

public class GameTest extends TestCase {
    public void testShouldWinIfNoGoldIsRemaining() {
        Game game = new Game(new Board(Arrays.asList(new Square(false))));
        assertTrue(game.win());
    }

    public void testShouldNotWinIfGoldRemaining() {
        Game game = new Game(new Board(Arrays.asList(new Square(true))));
        assertFalse(game.win());
    }
}
