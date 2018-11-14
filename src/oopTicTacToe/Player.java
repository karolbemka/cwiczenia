package oopTicTacToe;

public class Player {

    private String name;
    private Mark mark;

    public Player(String name, Mark mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return name + " (" + mark.toString() + ") ";
    }

    public Mark getMark() {
        return mark;
    }
}
