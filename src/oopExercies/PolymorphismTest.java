package oopExercies;

public class PolymorphismTest {

    public static void main(String[] args) {

        Square myRect = new Square(10, "red");
        Rectangle mySqure = new Rectangle(10,20, "black");
        Diamond myDiamond = new Diamond(10, 20, 5, "green");
        Triangle myTriangle = new Triangle(10, 5, "black");

        Figure[] figures = new Figure[4];
        figures[0] = myRect;
        figures[1] = mySqure;
        figures[2] = myDiamond;
        figures[3] = myTriangle;

        double area = 0.0;
        for (Figure figure : figures){
            area += figure.countArea();
        }
    }
}
