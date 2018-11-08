import java.util.Scanner;

public class ConsoleScanner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe pierwsza = ");
        int firstNumber = in.nextInt();
        System.out.println("Podaj liczbe druga = ");
        int secondNumber = in.nextInt();
        System.out.println("Podaj liczbe trzecia = ");
        int thirdNumber = in.nextInt();

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);

        double srednia = (firstNumber + secondNumber + thirdNumber)/3;
        System.out.println(srednia);

    }

}
