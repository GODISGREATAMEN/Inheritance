package game;

public class MoreThan7Game extends From3To7Game {

    public MoreThan7Game(double bet) {
        super(bet);
    }

    public double calculateWinnings() {
        return 2 * userBet - (0.1 * 2 * userBet);
    }
}
