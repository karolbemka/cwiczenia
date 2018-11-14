package oopTicTacToe;

public class Game {

    private ConsoleReader consoleReader;
    private GameState gameState;
    private Board board;
    private Player playerX;
    private Player playerO;
    private  Player activePlayer;
    
    
    public Game() {
        gameState = GameState.IN_PROGRESS;
        board = new Board(3,3);
        consoleReader = new ConsoleReader();
    }
    
    public void play() {
        
        initPlayers();
        activePlayer = playerX;
        while (gameState == GameState.IN_PROGRESS){
            System.out.println("Podaj wspolrzedne gracza: " + activePlayer.toString());

            // pobierz ruch aktywnego gracza i wykonaj ruch aktywnego gracza
            while (true) {
                int coordinateX = consoleReader.readCoordinate();
                int coordinateY = consoleReader.readCoordinate();
                if  (board.makeMove(coordinateX, coordinateY, activePlayer.getMark())){
                    break;
                }
            }
            // wyrysuj plansze
            System.out.println(board.toString());
            // sprawdz stan gry i przypisz do gameState
            gameState = board.getGameState();
            if (board.getGameState() == GameState.PLAYER_O_WIN) {
                System.out.println("Wygral " + playerO.toString());
            } else if (board.getGameState() == GameState.PLAYER_X_WIN) {
                System.out.println("Wygral " + playerX.toString());
            }
            // podmien aktywnego gracza
            
            activePlayer = activePlayer == playerO ? playerX : playerO;
            
        }
    }

    private void initPlayers() {
        System.out.println("Podaj imie gracza X: ");
        String playerXName = consoleReader.readName();
        playerX = new Player(playerXName, Mark.X);

        System.out.println("Podaj imie gracza O: ");
        String playerOName = consoleReader.readName();
        playerO = new Player(playerOName, Mark.O);
    }
}
