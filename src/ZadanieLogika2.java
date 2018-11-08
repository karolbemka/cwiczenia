import java.util.Scanner;

public class ZadanieLogika2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe pierwsza = ");
        int firstNumber = in.nextInt();
        System.out.println("Podaj liczbe druga = ");
        int secondNumber = in.nextInt();
        System.out.println("Podaj liczbe trzecia = ");
        int thirdNumber = in.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println(firstNumber);
        }
        else if (secondNumber >= firstNumber && secondNumber >= thirdNumber ){
            System.out.println(secondNumber);
        }
        else{
            System.out.println("Najwyzsza liczba to " +thirdNumber);
        }
    }
}
