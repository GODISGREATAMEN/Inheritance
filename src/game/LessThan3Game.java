package game;

public class LessThan3Game extends Game {
    public LessThan3Game(double bet) {

        super(bet);
    }
    public double calculateWinnings() {
        return 1.25 * userBet;
    }
}
