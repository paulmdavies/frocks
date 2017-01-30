import junit.framework.TestCase;

public class SquareTest extends TestCase {

    public void testShouldCollectCollectibleWhenVisitingASquare() {
        // Given
        Square square = new Square(true);

        // When
        square.visit();

        // Then
        assertFalse(square.hasCollectible());
    }
}
