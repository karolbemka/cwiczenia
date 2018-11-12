// Napisz program, który poda rozwiązania równania kwadratowego. Równanie powinno mieć postać ax^2 + bx + c = 0.
// Wzależności od podanych współczynników a, b i c program powinien wyświetlić wszystkie rozwiązania
// (2, 1, lub informacje o braku rozwiązań rzeczywistych).

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        double a = readFromConsole("a");
        double b = readFromConsole("b");
        double c = readFromConsole("c");

        if (countDelta(a, b, c) > 0) {
            System.out.println("Sa 2 rozwiazania");
            System.out.println("x1 = " + countX1(a, b, countDelta(a, b, c)));
            System.out.println("x2 = " + countX2(a, b, countDelta(a, b, c)));
        } else if (countDelta(a, b, c) == 0){
            System.out.println("Jest jedno rozwiazanie");
            System.out.println("x1 = x2 = " + countX1(a, b, countDelta(a, b, c)));
        } else {
            System.out.println("Nie ma rozwiazan rzeczywistych");
        }
    }

    static double countDelta(double a, double b, double c){
        double delta = Math.pow( b, 2) - (4* a * c);
        return  delta;
    }

    static double countX1(double a, double b, double delta){
        double x1 = (-b - Math.sqrt(delta)) / (2 *a);
        return x1;
    }

    static double countX2(double a, double b, double delta){
        double x2 = (-b + Math.sqrt(delta)) / (2 *a);
        return x2;
    }


    static double readFromConsole(String wspolczynnik) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wspolczynnik " + wspolczynnik + " = ");
        return scanner.nextDouble();
    }
}
