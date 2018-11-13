package oobExercies;

public class Square extends Rectangle {

    public Square(double a, String color) {
        super(a, a, color);
    }

    @Override
    public  void  setA(double a) {
        this.a = a;
        this.b = a;
    }

    @Override
    public  void  setB(double b) {
        this.a = b;
        this.b = b;
    }
//    public String getColor(){
//        System.out.println("Kwadrat nie da ci odpowiedzi o swoim kolorze");
//        return " ";
//    }
}
