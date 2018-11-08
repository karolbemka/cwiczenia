public class SwitchTest {

    enum Direction {
        LEFT, RIGHT, UP, DOWN, UNKNOWN;
    }

    public static void main(String[] args) {

        final Direction direction = Direction.RIGHT;

        switch (direction) {
            case LEFT:
                System.out.println("lewo");
                break;
            case RIGHT:
                System.out.println("prawo");
                break;
            case UP:
                System.out.println("gora");
                break;
            case DOWN:
                System.out.println("dol");
                break;
            default:
                 System.out.println("brak kierunku");
        }

    }
}
