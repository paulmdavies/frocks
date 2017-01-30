public class Square {
    private boolean hasCollectible;

    public Square(boolean hasCollectible) {
        this.hasCollectible = hasCollectible;
    }

    public boolean hasCollectible() {
        return hasCollectible;
    }

    public void visit() {
        this.hasCollectible = false;
    }
}
