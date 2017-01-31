import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class BoardTest extends TestCase {
    public void testShouldNotHaveCollectiblesLeftIfNoSquaresContainCollectibles() throws Exception {
        Board board = new Board(Arrays.asList(new Square(SquareContents.MAN)));
        assertFalse(board.hasCollectibleRemaining());
    }

    public void testShouldHaveCollectiblesRemainingIfAtLeastOneSquareContainsACollectible() throws Exception {
        Board board = new Board(Arrays.asList(new Square(SquareContents.COLLECTIBLE), new Square(SquareContents.MAN)));
        assertTrue(board.hasCollectibleRemaining());
    }

    public void testShouldFailBoardConstructionIfNoSquareContainsAMan() throws Exception {
        try {
            new Board(Arrays.asList(new Square(SquareContents.EMPTY)));
            fail("Expected Exception to be thrown");
        } catch (Exception e) {
        }
    }

    public void testShouldFailBoardConstructionIfMoreThanONeSquareContainsAMan() {
        try {
            new Board(Arrays.asList(new Square(SquareContents.MAN), new Square(SquareContents.MAN)));
            fail("Expected Exception to be thrown");
        } catch (Exception e) {
        }
    }
}