import java.util.Scanner;
// Kalkulator
public class Ex6 {
    public static void main(String[] args) {

        double firtsNumber = readFromConsole(1);
        double secondNumber = readFromConsole(2);
        String operation = readFromConsole();


        Obliczenie(firtsNumber, secondNumber, operation);
    }

    public static void Obliczenie(double firtsNumber, double secondNumber, String operation) {
        switch (operation) {
            case "+":
                System.out.println(dodawanie(firtsNumber, secondNumber));
                break;
            case "-":
                System.out.println(odejmowanie(firtsNumber, secondNumber));
                break;
            case "*":
                System.out.println(mnozenie(firtsNumber, secondNumber));
                break;
            case "/":
                System.out.println(dzielenie(firtsNumber, secondNumber));
                break;
            case "q":
                System.out.println("Wyjscie z programu");
                break;
            default:
                System.out.println("Podales zly znak");
        }
    }

    static double dodawanie (double firstNumber, double secondNumber) {
        double wynik = firstNumber + secondNumber;
        return  wynik;
    }

    static double odejmowanie (double firstNumber, double secondNumber) {
        double wynik = firstNumber - secondNumber;
        return  wynik;
    }

    static double mnozenie (double firstNumber, double secondNumber) {
        double wynik = firstNumber * secondNumber;
        return  wynik;
    }

    static double dzielenie (double firstNumber, double secondNumber) {
        double wynik = firstNumber / secondNumber;
        return  wynik;
    }

    static double readFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe " + numberInOrder);
        return scanner.nextDouble();
    }
    static String readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rodzaj operacji ");
        return scanner.next();
    }
}
