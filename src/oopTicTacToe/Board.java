package oopTicTacToe;

public class Board {

    private int xDimension;
    private int yDimension;
    private Mark[][] board;


    public Board(int xDimension, int yDimension) {
        board = new Mark[xDimension][yDimension];
        for (int i = 0; i < xDimension; i++) {
            for (int j = 0; j < yDimension; j++) {
                board[i][j] = Mark.Empty;
            }
        }

        this.xDimension = xDimension;
        this.yDimension = yDimension;

    }
    public GameState getGameState() {
        if ((board[0][0] == board[0][1] && board[0][1] == board[0][2]) && board[0][2] == Mark.O ||
                (board[1][0] == board[1][1] && board[1][1] == board[1][2]) && board[1][2] == Mark.O ||
                (board[2][0] == board[2][1] && board[2][1] == board[2][2]) && board[2][2] == Mark.O ||
                (board[0][0] == board[1][0] && board[1][0] == board[2][0]) && board[2][0] == Mark.O ||
                (board[0][1] == board[1][1] && board[1][1] == board[2][1]) && board[2][1] == Mark.O ||
                (board[0][2] == board[1][2] && board[1][2] == board[2][2]) && board[2][2] == Mark.O ||
                (board[0][0] == board[1][1] && board[1][1] == board[2][2]) && board[2][2] == Mark.O ||
                (board[0][2] == board[1][1] && board[1][1] == board[2][0]) && board[2][0] == Mark.O)
        {
            return GameState.PLAYER_O_WIN;
        } else if ((board[0][0] == board[0][1] && board[0][1] == board[0][2]) && board[0][2] == Mark.X ||
                (board[1][0] == board[1][1] && board[1][1] == board[1][2]) && board[1][2] == Mark.X ||
                (board[2][0] == board[2][1] && board[2][1] == board[2][2]) && board[2][2] == Mark.X ||
                (board[0][0] == board[1][0] && board[1][0] == board[2][0]) && board[2][0] == Mark.X ||
                (board[0][1] == board[1][1] && board[1][1] == board[2][1]) && board[2][1] == Mark.X ||
                (board[0][2] == board[1][2] && board[1][2] == board[2][2]) && board[2][2] == Mark.X ||
                (board[0][0] == board[1][1] && board[1][1] == board[2][2]) && board[2][2] == Mark.X ||
                (board[0][2] == board[1][1] && board[1][1] == board[2][0]) && board[2][0] == Mark.X) {
            return GameState.PLAYER_X_WIN;
        } else {
            return GameState.IN_PROGRESS;
        }
    }
    @Override
    public String toString() {
        String boardString = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (board[i][j]) {
                    case O:
                        boardString += "O ";
                        break;
                    case X:
                        boardString += "X ";
                        break;
                    case Empty:
                        boardString += "? ";
                        break;
                }
            }
            boardString += '\n';
        }
        return boardString;
    }

    public boolean makeMove(int x, int y, Mark mark) {
            if (board[x][y] != Mark.Empty) {
                System.out.println("To pole jest juz zajete, wybiez inne");
                return false;
            } else {
                board[x][y] = mark;
                return true;
            }
        }
    }