import junit.framework.TestCase;

import java.util.Arrays;

public class IntegrationTest extends TestCase {
    public void testGameShouldBePlayable() throws Exception {
        Square square1 = new Square(SquareContents.MAN);
        Square square2 = new Square(SquareContents.COLLECTIBLE);
        Board board = new Board(Arrays.asList(square1, square2));
        Game game = new Game(board);

        assertFalse(game.win());
        game.move();
        assertEquals(square1.hasMan(), false);
        assertEquals(square2.hasMan(), true);
        assertEquals(square2.hasCollectible(), false);
        assertTrue(game.win());
    }
}
