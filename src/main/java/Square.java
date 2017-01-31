public class Square {
    private boolean hasCollectible;
    private boolean hasWall;

    public Square(boolean hasCollectible, boolean hasWall) {
        this.hasCollectible = hasCollectible;
        this.hasWall = hasWall;
    }

    public boolean hasCollectible() {
        return hasCollectible;
    }

    public void visit() {
        this.hasCollectible = false;
    }

    public boolean visitable() {
        return !hasWall;
    }
}
