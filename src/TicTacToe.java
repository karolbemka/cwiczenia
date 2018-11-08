public class TicTacToe {
    public static void main(String[] args) {

        char[][] gameBoard = new char[3][3];
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                gameBoard[i][j] = '?';
            }
        }
        for (int i = 0; i < gameBoard.length; i++) {
                System.out.print(gameBoard[i][i] + " " + gameBoard[i][i+1] + " "  );
            }
        }
    }
}
