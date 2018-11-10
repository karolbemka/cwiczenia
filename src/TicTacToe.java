import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        char[][] gameBoard = emptyBoard();
        boolean shouldContinue = true;
        boolean empty = true;

        printBoard(emptyBoard());

        while (shouldContinue) {
            askForMove(gameBoard, empty, "pierwszy", 'X');
            empty = true;
            shouldContinue = isShouldContinue(gameBoard, shouldContinue, xWon(gameBoard), "Wygral X");
            if (shouldContinue) {
                askForMove(gameBoard, empty, "drugi", 'O');
                empty = true;
                shouldContinue = isShouldContinue(gameBoard, shouldContinue, oWon(gameBoard), "Wygral O");
            }
        }
    }

    public static void askForMove(char[][] gameBoard, boolean empty, String gracz, char o) {
        while (empty) {
            int i2 = readFromConsole(gracz);
            int j2 = readFromConsole(gracz);
            if (gameBoard[i2][j2] != '?') {
                System.out.println("To pole jest juz zajete, wybiez inne");
                printBoard(gameBoard);
            } else {
                gameBoard[i2][j2] = o;
                empty = false;
            }
        }
    }

    public static boolean isShouldContinue(char[][] gameBoard, boolean shouldContinue, boolean ifWon, String whoWon) {
        printBoard(gameBoard);
        if (ifWon) {
            shouldContinue = false;
            System.out.println(whoWon);
        }
        return shouldContinue;
    }

    static boolean oWon(char[][] gameBoard) {
        return ((gameBoard[0][0] == gameBoard[0][1] && gameBoard[0][1] == gameBoard[0][2]) && gameBoard[0][2] == 'O' ||
                (gameBoard[1][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[1][2]) && gameBoard[1][2] == 'O' ||
                (gameBoard[2][0] == gameBoard[2][1] && gameBoard[2][1] == gameBoard[2][2]) && gameBoard[2][2] == 'O' ||
                (gameBoard[0][0] == gameBoard[1][0] && gameBoard[1][0] == gameBoard[2][0]) && gameBoard[2][0] == 'O' ||
                (gameBoard[0][1] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][1]) && gameBoard[2][1] == 'O' ||
                (gameBoard[0][2] == gameBoard[1][2] && gameBoard[1][2] == gameBoard[2][2]) && gameBoard[2][2] == 'O' ||
                (gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2]) && gameBoard[2][2] == 'O' ||
                (gameBoard[0][2] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][0]) && gameBoard[2][0] == 'O');
    }

    static boolean xWon(char[][] gameBoard) {
        return ((gameBoard[0][0] == gameBoard[0][1] && gameBoard[0][1] == gameBoard[0][2]) && gameBoard[0][2] == 'X' ||
                (gameBoard[1][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[1][2]) && gameBoard[1][2] == 'X' ||
                (gameBoard[2][0] == gameBoard[2][1] && gameBoard[2][1] == gameBoard[2][2]) && gameBoard[2][2] == 'X' ||
                (gameBoard[0][0] == gameBoard[1][0] && gameBoard[1][0] == gameBoard[2][0]) && gameBoard[2][0] == 'X' ||
                (gameBoard[0][1] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][1]) && gameBoard[2][1] == 'X' ||
                (gameBoard[0][2] == gameBoard[1][2] && gameBoard[1][2] == gameBoard[2][2]) && gameBoard[2][2] == 'X' ||
                (gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2]) && gameBoard[2][2] == 'X' ||
                (gameBoard[0][2] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][0]) && gameBoard[2][0] == 'X');
    }

    static void printBoard(char[][] gameBoard) {
        for (char[] x : gameBoard) {
            for (char y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    static char[][] emptyBoard() {
        char[][] gameBoard = new char[3][3];
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                gameBoard[i][j] = '?';
            }
        }
        return gameBoard;
    }

    static int readFromConsole(String gracz) {
        boolean ask = true;
        Scanner scanner = new Scanner(System.in);
        int a = -1;
        while (ask) {
            System.out.println("Gracz " + gracz + " wybiera pole");
            a = scanner.nextInt();
            if (a != 1 && a != 2 && a != 0) {
                System.out.println("Podano zly znak");
            } else {
                ask = false;
            }
        }
        return a;
    }
}