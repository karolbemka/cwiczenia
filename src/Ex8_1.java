import java.util.Arrays;
import java.util.Scanner;

public class Ex8_1 {
    public static void main(String[] args) {
        char[] leftSide = {'w', 'p', 'b', 's'};
        char[] rightSide = {'m', 'q', 'd', 'z'};

        String startingString = readFromConsole();

//        char[] startingStringChar = {'*', 's', 'm', 'w', 'h'};
        char[] startingStringChar = startingString.toCharArray();
        char[] newStringChar = scanForBombs(startingStringChar);

        System.out.println(Arrays.toString(newStringChar));
        int leftTeamScore = countPoints(newStringChar, leftSide);
        int rightTeamScore = countPoints(newStringChar, rightSide);

        System.out.println("Left team score is " + leftTeamScore);
        System.out.println("Right team score is " + rightTeamScore);

        whoWon(leftTeamScore,rightTeamScore);
    }
    static void whoWon(int leftTeamScore, int rightTeamScore){
        if (leftTeamScore > rightTeamScore) {
            System.out.println("Left team is the WINNER!");
        } else if (rightTeamScore > leftTeamScore){
            System.out.println("Right team is the WINNER!");
        } else {
            System.out.println("TIE");
        }
    }

    static int countPoints(char[] inputChar, char[] pointsChar){
        int pointsSum = 0;
        for (char anInputChar : inputChar)
            for (int j = 0; j < pointsChar.length; j++) {
                if (anInputChar == pointsChar[j]) {
                    pointsSum += pointsChar.length - j;
                }
            }
        return pointsSum;
    }

    static char[] scanForBombs(char[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (i == 0 && inputArray[i] == '*' && inputArray[i + 1] != '*'){
                    inputArray[i + 1] = '_';
                } else if (i > 0 && i < inputArray.length - 1 && inputArray[i] == '*') {
                    for (int j= i-1 ; j <= i+1; j+=2 ) {
                        if (inputArray[j] != '*') {
                            inputArray[j] = '_';
                        }
                    }
                }
                else if (i == inputArray.length - 1 && inputArray[i] == '*' && inputArray[i - 1] != '*') {
                    inputArray[i - 1] = '_';
                }
        }
        return inputArray;
    }

    static String readFromConsole(){
        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz ciag znakow, mozesz wstawic '*' jako bombe.");
        return input.nextLine();
    }
}
