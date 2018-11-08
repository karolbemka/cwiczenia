import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        char[][] gameBoard = emptyBoard();
        boolean shouldContinue = true;
        boolean full = true;

        printBoard(emptyBoard());

        while (shouldContinue) {
            while (full) {
                int i1 = readFromConsole("pierwszy");
                int j1 = readFromConsole("pierwszy");
                if (gameBoard[i1][j1] != '?') {
                    System.out.println("To pole jest juz zajete, wybiez inne");
                    printBoard(gameBoard);
                } else {
                    gameBoard[i1][j1] = 'X';
                    full = false;
                }
            }
            full = true;
            printBoard(gameBoard);
            if (xWon(gameBoard)) {
                shouldContinue = false;
                System.out.println("Wygral X");
            }
            if (shouldContinue) {
                while (full) {
                    int i2 = readFromConsole("drugi");
                    int j2 = readFromConsole("drugi");
                    if (gameBoard[i2][j2] != '?') {
                        System.out.println("To pole jest juz zajete, wybiez inne");
                        printBoard(gameBoard);
                    } else {
                        gameBoard[i2][j2] = 'O';
                        full = false;
                    }
                }
                full = true;
                printBoard(gameBoard);
                if (oWon(gameBoard)){
                    shouldContinue = false;
                    System.out.println("Wygral O");
                }
            }
        }
    }
    static boolean oWon (char[][] gameBoard) {
            return ((gameBoard[0][0] == gameBoard[0][1] && gameBoard[0][1] == gameBoard[0][2]) && gameBoard[0][2] == 'O' ||
                    (gameBoard[1][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[1][2]) && gameBoard[1][2] == 'O' ||
                    (gameBoard[2][0] == gameBoard[2][1] && gameBoard[2][1] == gameBoard[2][2]) && gameBoard[2][2] == 'O' ||
                    (gameBoard[0][0] == gameBoard[1][0] && gameBoard[1][0] == gameBoard[2][0]) && gameBoard[2][0] == 'O' ||
                    (gameBoard[0][1] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][1]) && gameBoard[2][1] == 'O' ||
                    (gameBoard[0][2] == gameBoard[1][2] && gameBoard[1][2] == gameBoard[2][2]) && gameBoard[2][2] == 'O' ||
                    (gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2]) && gameBoard[2][2] == 'O' ||
                    (gameBoard[0][2] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][0]) && gameBoard[2][0] == 'O');
        }
    static boolean xWon (char[][] gameBoard) {
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gracz " + gracz + " wybiera pole");
        return scanner.nextInt();
    }
}


