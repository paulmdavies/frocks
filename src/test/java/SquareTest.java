import junit.framework.TestCase;

public class SquareTest extends TestCase {

    public void testShouldCollectCollectibleWhenVisitingASquare() {
        // Given
        Square square = new Square(true, false);

        // When
        square.visit();

        // Then
        assertFalse(square.hasCollectible());
    }

    public void testSquareShouldBeVisitableIfItDoesNotContainAWall() {
        // Given
        Square square = new Square(false, false);

        // Then
        assertTrue(square.visitable());
    }

    public void testSquareShouldNotBeVisitableIfItContainsAWall() {
        // Given
        Square square = new Square(false, true);

        // Then
        assertFalse(square.visitable());
    }
}
