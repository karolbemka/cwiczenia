package oobExercies;

public class Rectangle extends Figure {

    protected double a;
    protected double b;

    public Rectangle(double a, double b, String color) {
        super(color);
        this.a = a;
        this.b = b;
    }

    double countArea(){
        return a * b;
    }

    double countPerimieter() {
        return 2 * a  + 2 *b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
