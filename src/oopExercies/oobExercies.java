package oobExercies;

public class oobExercies {
    public static void main(String[] args) {
        Rectangle smallRectangle = new Rectangle(10,15, "blue");
        Square bigSquare = new Square(5, "red");

        System.out.println(bigSquare.countPerimieter());
        System.out.println(smallRectangle.countArea());
        System.out.println(smallRectangle.getColor());
        System.out.println(bigSquare.getColor());
    }
}
