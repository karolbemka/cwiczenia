// Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli z odcinków o długości
// przekazanych w argumentach można zbudować trójkąt prostokątny.

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        double bokA = readFromConsole("pierwszego");
        double bokB = readFromConsole("drugiego");
        double bokC = readFromConsole("trzeciego");

        if (isTriangle(segregate(bokA, bokB, bokC))){
            System.out.println("Mozna z tego zbudowac trojkat prostokatny");
        } else {
            System.out.println("Nie mozna z tego zbudowac trojkata prostokatnego");
        }
    }

    static boolean isTriangle(double[] boki){
        if (Math.pow(boki[0], 2) == (Math.pow(boki[1], 2) + Math.pow(boki[2], 2))) {
            return true;
        } else {
            return false;
        }

    }

    static double[] segregate(double a, double b, double c){
        double[] boki = new double[3];
        if (a > b && a > c){
            boki[0] = a;
            boki[1] = b;
            boki[2] = c;
        } else if (b > a && b > c){
            boki[0] = b;
            boki[1] = a;
            boki[2] = c;
        } else {
            boki[0] = c;
            boki[1] = a;
            boki[2] = b;
        }
        return boki;
    }

    static double readFromConsole(String wspolczynnik) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosc boku " + wspolczynnik);
        return scanner.nextDouble();
    }
}


