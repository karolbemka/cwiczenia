import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        int n = readFromConsole(1);
        System.out.println(fibonaci(n));
    }

    static int fibonaci (int n){
        int iloczyn = 0;
        int suma = 0;
        for (int i = 0; i < n; i++) {
            iloczyn = i * i;
            suma += iloczyn;
        }
        return suma;
    }

    static int readFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe  " + numberInOrder);
        return scanner.nextInt();
    }
}
