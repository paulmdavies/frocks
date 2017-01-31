public class Square {
    private SquareContents contents;

    public Square(SquareContents contents) {
        this.contents = contents;
    }

    public boolean hasCollectible() {
        return contents == SquareContents.COLLECTIBLE;
    }

    public void visit() {
        contents = SquareContents.MAN;
    }

    public boolean visitable() {
        return contents != SquareContents.WALL;
    }

    public boolean hasMan() {
        return contents == SquareContents.MAN;
    }

    public void leave() {
        contents = SquareContents.EMPTY;
    }
}
