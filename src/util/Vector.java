package util;

public class Vector {
    private double x;
    private double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector() {
        this.x = 0;
        this.y = 0;
    }

    public IntVector castInt() {
        return new IntVector((int) x, (int) y);
    }

    public Vector abs() {
        return new Vector(Math.abs(x), Math.abs(y));
    }

    public Vector normalize() {
        double length = Math.sqrt(x * x + y * y);
        if (length == 0) {
            return new Vector(0, 0);
        }
        return new Vector(x / length, y / length);
    }

    public Vector clone() {
        return new Vector(x, y);
    }

    public Vector add(Vector v) {
        return new Vector(x + v.getX(), y + v.getY());
    }

    public Vector sub(Vector v) {
        return new Vector(x - v.getX(), y - v.getY());
    }

    public Vector add(double a) {
        return new Vector(x + a, y + a);
    }

    public Vector sub(double a) {
        return new Vector(x - a, y - a);
    }

    public Vector mult(double factor) {
        return new Vector(x * factor, y * factor);
    }

    public Vector div(double factor) {
        return new Vector(x / factor, y / factor);
    }

    public Vector rotate(double angle) {
        double x1 = x * Math.cos(angle) - y * Math.sin(angle);
        double y1 = x * Math.sin(angle) + y * Math.cos(angle);
        return new Vector(x1, y1);
    }

    public Vector setMag(double mag) {
        double oldMag = getMag();
        if (oldMag == 0) {
            return new Vector();
        }
        double ratio = mag / oldMag;
        return new Vector(x * ratio, y * ratio);
    }

    public double getMag() {
        return Math.sqrt(x * x + y * y);
    }

    public double getMagSq() {
        return x * x + y * y;
    }

    public void setAngle() {
        double angle = Math.atan2(y, x);
        x = Math.cos(angle);
        y = Math.sin(angle);
    }

    public double getAngle() {
        return Math.atan2(y, x);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void setVector(double x, double y) {
        this.x = x;
        this.y = y;
    }
}