package oopTicTacToe;

public class Board {

    private char[][] gameBoard;


    public Board() {
        gameBoard = new char[3][3];
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                gameBoard[i][j] = '?';
            }
        }
    }
//
//    public void askForMove(char[][] gameBoard, boolean empty, String gracz, char o) {
//        while (empty) {
//            int i = readFromConsole(gracz);
//            int j = readFromConsole(gracz);
//            if (gameBoard[i][j] != '?') {
//                System.out.println("To pole jest juz zajete, wybiez inne");
//                printBoard(gameBoard);
//            } else {
//                gameBoard[i][j] = o;
//                empty = false;
//            }
//        }
//    }
//}
