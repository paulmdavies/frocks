import junit.framework.TestCase;

import java.util.Arrays;

public class BoardTest extends TestCase {
    public void testShouldNotHaveCollectiblesLeftIfNoSquaresContainCollectibles() {
        Board board = new Board(Arrays.asList(new Square(false)));
        assertFalse(board.hasCollectibleRemaining());
    }

    public void testShouldHaveCollectiblesRemainingIfAtLeastOneSquareContainsACollectible() {
        Board board = new Board(Arrays.asList(new Square(true), new Square(false)));
        assertTrue(board.hasCollectibleRemaining());
    }
}