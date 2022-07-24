package util;

public class IntVector {

    public static final IntVector UP = new IntVector(0, -1);
    public static final IntVector DOWN = new IntVector(0, 1);
    public static final IntVector LEFT = new IntVector(-1, 0);
    public static final IntVector RIGHT = new IntVector(1, 0);

    private int x, y;

    public IntVector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public IntVector() {
        this.x = 0;
        this.y = 0;
    }

    public IntVector add(IntVector vector) {
        return new IntVector(x + vector.x, y + vector.y);
    }

    public IntVector add(int a) {
        return new IntVector(x + a, y + a);
    }

    public IntVector addX(int x) {
        return new IntVector(this.x + x, y);
    }

    public IntVector addY(int y) {
        return new IntVector(x, this.y + y);
    }

    public IntVector subtract(IntVector vector) {
        return new IntVector(x - vector.x, y - vector.y);
    }

    public IntVector subtract(int a) {
        return new IntVector(x - a, y - a);
    }

    public IntVector subtractX(int x) {
        return new IntVector(this.x - x, y);
    }

    public IntVector subtractY(int y) {
        return new IntVector(x, this.y - y);
    }

    public IntVector multiply(int scalar) {
        return new IntVector(x * scalar, y * scalar);
    }

    public IntVector multiplyX(int x) {
        return new IntVector(this.x * x, y);
    }

    public IntVector multiplyY(int y) {
        return new IntVector(x, this.y * y);
    }

    public IntVector divide(int scalar) {
        return new IntVector(x / scalar, y / scalar);
    }

    public IntVector divideX(int x) {
        return new IntVector(this.x / x, y);
    }

    public IntVector divideY(int y) {
        return new IntVector(x, this.y / y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public IntVector reverse() {
        return new IntVector(-x, -y);
    }

    public IntVector reverseX() {
        return new IntVector(-x, y);
    }

    public IntVector reverseY() {
        return new IntVector(x, -y);
    }

    public IntVector flipXY() {
        return new IntVector(y, x);
    }

    public IntVector abs() {
        return new IntVector(Math.abs(x), Math.abs(y));
    }

    public IntVector absX() {
        return new IntVector(Math.abs(x), y);
    }

    public IntVector absY() {
        return new IntVector(x, Math.abs(y));
    }

    public IntVector min(IntVector IntVector) {
        return new IntVector(Math.min(x, IntVector.x), Math.min(y, IntVector.y));
    }

    public IntVector minX(IntVector IntVector) {
        return new IntVector(Math.min(x, IntVector.x), y);
    }

    public IntVector minY(IntVector IntVector) {
        return new IntVector(x, Math.min(y, IntVector.y));
    }

    public IntVector max(IntVector IntVector) {
        return new IntVector(Math.max(x, IntVector.x), Math.max(y, IntVector.y));
    }

    public IntVector maxX(IntVector IntVector) {
        return new IntVector(Math.max(x, IntVector.x), y);
    }

    public IntVector maxY(IntVector IntVector) {
        return new IntVector(x, Math.max(y, IntVector.y));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof IntVector)) {
            return false;
        }
        IntVector vector = (IntVector) obj;
        return x == vector.x && y == vector.y;
    }

    @Override
    public IntVector clone() {
        return new IntVector(x, y);
    }
}
