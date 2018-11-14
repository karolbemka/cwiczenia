package exceptions;

import oopExercies.Triangle;

public class ExceptionTests {

    public static void main(String[] args) {

        try {
            Triangle triangle = new Triangle(10, 20);
            System.out.println(triangle.getColor());
        } catch (invalidSideException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
