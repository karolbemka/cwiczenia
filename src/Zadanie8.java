//import java.util.Scanner;
//
//public class Zadanie8 {

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Wpisz string dla lewej strony = ");
//        String lewaStrona = input.nextLine();
//        System.out.println("Wpisz string dla prawej strony = ");
//        String prawaStrona = input.nextLine();
//
//        char[] charLewy = lewaStrona.toCharArray();
//        char[] charPrawy = prawaStrona.toCharArray();
//
//        int sumaLewa = 0;
//        int sumaPrawa = 0;

//        for (char x:charLewy){
//            if (x == 'w'){
//                sumaLewa += 4;
//            } else if (x == 'p'){
//                sumaLewa += 3;
//            } else if (x == 'b'){
//                sumaLewa += 2;
//            } else if (x == 's'){
//                sumaLewa += 1;
//            }
//        }

//        for (char x:charPrawy) {
//            if (x == 'm') {
//                sumaPrawa += 4;
//            } else if (x == 'q') {
//                sumaPrawa += 3;
//            } else if (x == 'd') {
//                sumaPrawa += 2;
//            } else if (x == 'z') {
//                sumaPrawa += 1;
//            }
//        }
//        System.out.println("Wynik lewej strony to = " + sumaLewa);
//        System.out.println("Wynik prawej strony to = " + sumaPrawa);
//
//        if (sumaLewa > sumaPrawa){
//            System.out.println( "Wygrała strona lewa");
//        } else if (sumaLewa == sumaPrawa){
//            System.out.println("Jest remis");
//        }
//        else {
//            System.out.println("Wygrala strona prawa");
//        }
//    }
//}