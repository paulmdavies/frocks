import junit.framework.TestCase;

import java.util.Arrays;

public class GameTest extends TestCase {
    public void testShouldWinIfNoCollectiblesAreRemaining() {
        Game game = new Game(new Board(Arrays.asList(new Square(SquareContents.NOTHING))));
        assertTrue(game.win());
    }

    public void testShouldNotWinIfCollectiblesAreRemaining() {
        Game game = new Game(new Board(Arrays.asList(new Square(SquareContents.COLLECTIBLE))));
        assertFalse(game.win());
    }
}
