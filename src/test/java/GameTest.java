import junit.framework.TestCase;

import java.util.Arrays;

public class GameTest extends TestCase {
    public void testShouldWinIfNoCollectiblesAreRemaining() throws Exception {
        Game game = new Game(new Board(Arrays.asList(new Square(SquareContents.MAN))));
        assertTrue(game.win());
    }

    public void testShouldNotWinIfCollectiblesAreRemaining() throws Exception {
        Game game = new Game(new Board(Arrays.asList(new Square(SquareContents.COLLECTIBLE), new Square(SquareContents.MAN))));
        assertFalse(game.win());
    }
}
