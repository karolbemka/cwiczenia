package objectOrientedPrograming;

public class Block {

    private double a;
    private double b;

    public Block(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double countArea() {
        return a * b;
    }

    double countPerimeter() {
        return 2 * a + 2 * b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}