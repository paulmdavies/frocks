public class Square {
    private SquareContents contents;

    public Square(SquareContents contents) {
        this.contents = contents;
    }

    public boolean hasCollectible() {
        return contents == SquareContents.COLLECTIBLE;
    }

    public void visit() {
        if (contents == SquareContents.COLLECTIBLE) {
            contents = SquareContents.NOTHING;
        }
    }

    public boolean visitable() {
        return contents != SquareContents.WALL;
    }
}
