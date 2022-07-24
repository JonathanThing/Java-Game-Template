package util;

public class Vector {

    public static final Vector UP = new Vector(0, -1);
    public static final Vector DOWN = new Vector(0, 1);
    public static final Vector LEFT = new Vector(-1, 0);
    public static final Vector RIGHT = new Vector(1, 0);

    private double x, y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector(double angle) {
        this.x = Math.cos(angle);
        this.y = Math.sin(angle);
    }

    public Vector() {
        this.x = 0;
        this.y = 0;
    }

    public Vector add(Vector vector) {
        return new Vector(x + vector.x, y + vector.y);
    }

    public Vector add(double a) {
        return new Vector(x + a, y + a);
    }

    public Vector addX(double x) {
        return new Vector(this.x + x, y);
    }

    public Vector addY(double y) {
        return new Vector(x, this.y + y);
    }

    public Vector subtract(Vector vector) {
        return new Vector(x - vector.x, y - vector.y);
    }

    public Vector subtract(double a) {
        return new Vector(x - a, y - a);
    }

    public Vector subtractX(double x) {
        return new Vector(this.x - x, y);
    }

    public Vector subtractY(double y) {
        return new Vector(x, this.y - y);
    }

    public Vector multiply(double scalar) {
        return new Vector(x * scalar, y * scalar);
    }

    public Vector multiplyX(double x) {
        return new Vector(this.x * x, y);
    }

    public Vector multiplyY(double y) {
        return new Vector(x, this.y * y);
    }

    public Vector divide(double scalar) {
        return new Vector(x / scalar, y / scalar);
    }

    public Vector divideX(double x) {
        return new Vector(this.x / x, y);
    }

    public Vector divideY(double y) {
        return new Vector(x, this.y / y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getMagnitude() {
        return Math.sqrt(x * x + y * y);
    }

    public double getMagnitudeSquared() {
        return x * x + y * y;
    }

    public double getAngle() {
        return Math.atan2(y, x);
    }

    public Vector rotate(double angle) {
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        return new Vector(newX, newY);
    }

    public Vector normalize() {
        double magnitude = getMagnitude();
        if (magnitude == 0) {
            return new Vector(0, 0);
        }

        return new Vector(x / magnitude, y / magnitude);
    }

    public Vector reverse() {
        return new Vector(-x, -y);
    }

    public Vector reverseX() {
        return new Vector(-x, y);
    }

    public Vector reverseY() {
        return new Vector(x, -y);
    }

    public Vector flipXY() {
        return new Vector(y, x);
    }

    public Vector setMag(double magnitude) {
        double oldMagnitude = getMagnitude();
        if (oldMagnitude == 0) {
            return new Vector();
        }
        double ratio = magnitude / oldMagnitude;
        return new Vector(x * ratio, y * ratio);
    }

    public Vector floor() {
        return new Vector(Math.floor(x), Math.floor(y));
    }

    public Vector floorX() {
        return new Vector(Math.floor(x), y);
    }

    public Vector floorY() {
        return new Vector(x, Math.floor(y));
    }

    public Vector ceil() {
        return new Vector(Math.ceil(x), Math.ceil(y));
    }

    public Vector ceilX() {
        return new Vector(Math.ceil(x), y);
    }

    public Vector ceilY() {
        return new Vector(x, Math.ceil(y));
    }

    public Vector round() {
        return new Vector(Math.round(x), Math.round(y));
    }

    public Vector roundX() {
        return new Vector(Math.round(x), y);
    }

    public Vector roundY() {
        return new Vector(x, Math.round(y));
    }

    public Vector abs() {
        return new Vector(Math.abs(x), Math.abs(y));
    }

    public Vector absX() {
        return new Vector(Math.abs(x), y);
    }

    public Vector absY() {
        return new Vector(x, Math.abs(y));
    }

    public Vector min(Vector vector) {
        return new Vector(Math.min(x, vector.x), Math.min(y, vector.y));
    }

    public Vector minX(Vector vector) {
        return new Vector(Math.min(x, vector.x), y);
    }

    public Vector minY(Vector vector) {
        return new Vector(x, Math.min(y, vector.y));
    }

    public Vector max(Vector vector) {
        return new Vector(Math.max(x, vector.x), Math.max(y, vector.y));
    }

    public Vector maxX(Vector vector) {
        return new Vector(Math.max(x, vector.x), y);
    }

    public Vector maxY(Vector vector) {
        return new Vector(x, Math.max(y, vector.y));
    }

    public IntVector castInt() {
        return new IntVector((int) x, (int) y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Vector)) {
            return false;
        }
        Vector vector = (Vector) obj;
        return x == vector.x && y == vector.y;
    }

    @Override
    public Vector clone() {
        return new Vector(x, y);
    }
}
