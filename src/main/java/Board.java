import java.util.List;

public class Board {
    private List<Square> squares;

    public Board(List<Square> squares) {

        this.squares = squares;
    }

    public boolean hasGoldRemaining() {
        return squares.stream().anyMatch(square -> square.hasGold());
    }
}
