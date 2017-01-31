import java.util.List;
import java.util.stream.Stream;

public class Board {
    private List<Square> squares;

    public Board(List<Square> squares) throws Exception {
        this.squares = squares;
        Stream<Square> manSquares = squares.stream().filter(Square::hasMan);
        if (manSquares.count() != 1) throw new Exception();
    }

    public boolean hasCollectibleRemaining() {
        return squares.stream().anyMatch(square -> square.hasCollectible());
    }
}
