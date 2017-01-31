import junit.framework.TestCase;

import java.util.Arrays;

public class GameTest extends TestCase {
    public void testShouldWinIfNoCollectiblesAreRemaining() {
        Game game = new Game(new Board(Arrays.asList(new Square(false, false))));
        assertTrue(game.win());
    }

    public void testShouldNotWinIfCollectiblesAreRemaining() {
        Game game = new Game(new Board(Arrays.asList(new Square(true, false))));
        assertFalse(game.win());
    }
}
