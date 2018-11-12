// Zaimplementuj program obliczający podany element ciągu Fibonacciego w sposób nieiteracyjny (bez używania instrukcji for, while, do-while).

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        int ntyElement = readFromConsole();
        System.out.println("Twoj nty element ciagu Fibonacciego to = " + wynikFibonacci(ntyElement));

    }

    static int wynikFibonacci (int ntyElement){
        int wynikFibonacci = 0;
        switch (ntyElement) {
            case 0:
                return 0;
            case 1:
                return 1;
                default:
                    return wynikFibonacci = wynikFibonacci(ntyElement -1) + wynikFibonacci(ntyElement -2);
        }
    }

    static int readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ktory element ciagu Fibonacciego chcesz znac.");
        return scanner.nextInt();
    }
}
