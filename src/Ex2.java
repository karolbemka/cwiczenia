import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        int number = readFromConsole(1);
        int abs = countAbs(number);

        System.out.println("Wartosc bezwzgledna " + abs);

    }
    static int countAbs (int number) {
        return number < 0 ? number *-1 : number;
    }

    static int readFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe " + numberInOrder);
        return scanner.nextInt();
    }
}
