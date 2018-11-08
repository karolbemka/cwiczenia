import java.sql.SQLOutput;

public class Funkcje {

    public static void main(String[] args) {
        int[] xCoordinates = {5, 6, 7, 8, 9};
        int[] yCoordinates = {1, 2, 3, 4, 5};
        int[] zCoordinates = {5, 6, 7, 8, 9};

        int xCoordinatesSum = countSumOfElements(xCoordinates);
        int yCoordinatesSum = countSumOfElements(yCoordinates);

        System.out.println(xCoordinatesSum);
        System.out.println(yCoordinatesSum);

        double zCoordinatesAvarage = countAvarage(zCoordinates);
        System.out.println(zCoordinatesAvarage);

        System.out.println(recursiveFunction(10, ""));

    }

    static double countVelocity(double time, double route) {
            double velocity = route / time;
            return velocity;
    }

    static int countSumOfElements(int[] inputArray){
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++){
            sum += inputArray[i];
        }
        return sum;
    }

    static double countAvarage(int[] inputArray){
        double sum = countSumOfElements(inputArray);
        return sum / inputArray.length;

        /*
        double avarage = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
            avarage = sum / inputArray.length;
        }
        return avarage;
        */
    }

    static String recursiveFunction (int iterator, String myString) {
        int iterations = 0;
        if (iterator > 0) {
            System.out.println("Iterator value: " + iterator);
            return recursiveFunction(iterator - 1, myString +" "+iterator);
        } else {
            System.out.println("Recursion is over");
            return myString;
        }
    }

}
