package oopExercies;

import exceptions.invalidSideException;

public class Triangle extends Figure {

    protected double a;
    protected double h;

    public Triangle(double a, double h) throws invalidSideException {
        super("s");
        if (a <= 0 || h <= 0) {
            throw new invalidSideException();
        }
        this.a = a;
        this.h = h;
    }

    public double countArea() {
        return (a *h) / 2;
    }
}
