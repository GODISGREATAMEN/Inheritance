package game;

public class From3To7Game extends LessThan3Game {
    public From3To7Game(double bet) {
        super(bet);
    }

    public double calculateWinnings() {
        return 1.25 * userBet - 0.05 * userBet;
    }
}