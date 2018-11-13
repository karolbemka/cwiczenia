package oopExercies;

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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Square) {
            Square squareToCompare = (Square) obj;
            if (this.a == squareToCompare.a && this.b == squareToCompare.b){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //    public String getColor(){
//        System.out.println("Kwadrat nie da ci odpowiedzi o swoim kolorze");
//        return " ";
//    }
}
