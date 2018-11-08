import java.util.Scanner;

public class ZadanieKalkulator {

    public static void main(String[] args) {

        boolean shouldContinue = true;
        int wynik = 0;
        while (shouldContinue) {
            Scanner in = new Scanner(System.in);
            System.out.println("Podaj liczbe pierwsza liczbe = ");
            int firstNumber = in.nextInt();
            System.out.println("Podaj liczbe druga liczbe = ");
            int secondNumber = in.nextInt();
            System.out.println("Podaj rodzaj operacji = ");
            String operation = in.next();
            if (operation.equals("q")) {
                shouldContinue = false;
            }
            else {
                switch (operation) {
                    case "+":
                        wynik = firstNumber + secondNumber;
                        System.out.println(wynik);
                        break;
                    case "'":
                        wynik = firstNumber - secondNumber;
                        System.out.println(wynik);
                        break;
                    case "*":
                        wynik = firstNumber * secondNumber;
                        System.out.println(wynik);
                        break;
                    case "/":
                        wynik = firstNumber / secondNumber;
                        System.out.println(wynik);
                        break;
                    default:
                        System.out.println("Podales zly znak");
                }
            }
        }
    }
}