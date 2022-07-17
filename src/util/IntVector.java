package util;

public class IntVector {
    private int x;
    private int y;

    public IntVector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public IntVector() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void setVector(int x, int y) {
        this.x = x;
        this.y = y;
    }
}