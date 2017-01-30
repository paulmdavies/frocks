import junit.framework.TestCase;

import java.util.Arrays;

public class BoardTest extends TestCase {
    public void testShouldNotHaveGoldLeftIfNoSquaresContainGold() {
        Board board = new Board(Arrays.asList(new Square(false)));
        assertFalse(board.hasGoldRemaining());
    }

    public void testShouldHaveGoldRemainingIfAtLeastOneSquareContainsGold() {
        Board board = new Board(Arrays.asList(new Square(true), new Square(false)));
        assertTrue(board.hasGoldRemaining());
    }
}