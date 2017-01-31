import junit.framework.TestCase;

import java.util.Arrays;

public class BoardTest extends TestCase {
    public void testShouldNotHaveCollectiblesLeftIfNoSquaresContainCollectibles() {
        Board board = new Board(Arrays.asList(new Square(SquareContents.EMPTY)));
        assertFalse(board.hasCollectibleRemaining());
    }

    public void testShouldHaveCollectiblesRemainingIfAtLeastOneSquareContainsACollectible() {
        Board board = new Board(Arrays.asList(new Square(SquareContents.COLLECTIBLE), new Square(SquareContents.EMPTY)));
        assertTrue(board.hasCollectibleRemaining());
    }
}