package objectOrientedPrograming;

public class OOP {

    public static void main(String[] args) {

//        Diamond[] diamonds = new Diamond[10];
//
//        for (int i = 0; i < 10; i++){
//            diamonds[i] = new Diamond(i, i);
//        }



//        Diamond smallDiamond = new Diamond(10.0, 15.0, 2);
//        Diamond bigDiamond = new Diamond(10.5, 25.5, 2);

//      smallDiamond.e = 10; // e jest private wiec nie mozna go zmienic poza klasa
//      smallDiamond.f = 11; // f jest public > jest mozliwosc zmiany w innych klasach


//
//        System.out.println("Pole rabu " + smallDiamond.countArea());
//        smallDiamond.incrementE();
//        System.out.println("Pole rabu " + bigDiamond.countArea());
//        System.out.println("Pole rabu " + smallDiamond.countArea());

        Block smallBlock = new Block(5, 10);
        Block bigBlock = new Block(11.5, 20.1);

        System.out.println("Wymiary prostokata to " + smallBlock.getA() + " oraz " + smallBlock.getB());

        System.out.println("Pole malego bloku to = " + smallBlock.countArea());
        System.out.println("Obwod duzego bloku to = " + smallBlock.countPerimeter());

        System.out.println("Pole duzego bloku to = " + bigBlock.countArea());
        System.out.println("Obwod duzego bloku to = " + bigBlock.countPerimeter());


    }
}
