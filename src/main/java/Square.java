public class Square {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    public int computeArea() {
        return this.length * this.length;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
