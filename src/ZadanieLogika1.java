import java.util.Scanner;

public class ZadanieLogika1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe pierwsza = ");
        int firstNumber = in.nextInt();

        if (firstNumber < 0){
            firstNumber *= -1;
            System.out.println(firstNumber);
        }
        else
            System.out.println(firstNumber);
    }
}
