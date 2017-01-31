import junit.framework.TestCase;

public class SquareTest extends TestCase {

    public void testShouldCollectCollectibleWhenVisitingASquare() {
        // Given
        Square square = new Square(SquareContents.COLLECTIBLE);

        // When
        square.visit();

        // Then
        assertFalse(square.hasCollectible());
    }

    public void testSquareShouldBeVisitableIfItIsEmpty() {
        // Given
        Square square = new Square(SquareContents.NOTHING);

        // Then
        assertTrue(square.visitable());
    }

    public void testSquareShouldBeVisitableIfItContainsACollectible() {
        // Given
        Square square = new Square(SquareContents.COLLECTIBLE);

        // Then
        assertTrue(square.visitable());
    }

    public void testSquareShouldNotBeVisitableIfItContainsAWall() {
        // Given
        Square square = new Square(SquareContents.WALL);

        // Then
        assertFalse(square.visitable());
    }
}
