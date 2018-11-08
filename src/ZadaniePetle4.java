import java.util.Scanner;

public class ZadaniePetle4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe n = ");
        int firstNumber = in.nextInt();

        int iloczyn = 0;
        int suma = 0;
        for (int i = 0; i < firstNumber; i++) {
            iloczyn = i * i;
            suma += iloczyn;
        }
        System.out.println(suma);
    }
}
