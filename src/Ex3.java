import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        int firtsNumber = readFromConsole(1);
        int secondNumber = readFromConsole(2);
        int thirdNumber = readFromConsole(3);

        int[] greatest= findGreatestNumber(firtsNumber, secondNumber, thirdNumber);

        System.out.println(Arrays.toString(greatest));

    }

    static int[] findGreatestNumber(int... numbers) {
        int resultCount = 0;

        int greatest = numbers[0];
        for (int i = 0; i < numbers.length; i ++) {
            if (numbers[i] > greatest) {
                greatest = numbers[i];
            }
        }

        int greatestCount = 0;
        for (int i = 0; i < numbers.length; i ++) {
                if (numbers[i] == greatest) {
                    greatestCount++;
                }
        }
        int[] result = new int[greatestCount];
        for (int i = 0; i < greatestCount; i ++) {
            result[i] = greatest;
        }
        return result;
    }

    static int readFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe " + numberInOrder);
        return scanner.nextInt();
    }
}
