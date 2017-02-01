public class Game {
    private Board board;

    public Game(Board board) {
        this.board = board;
    }

    public boolean win() {
        return !board.hasCollectibleRemaining();
    }

    public void move() {
        board.move();
    }
}
