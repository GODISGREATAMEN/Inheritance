package game;

public class Game {
    public double userBet;

    public Game(double bet) {
        this.userBet = bet;
    }

    double chooseCorrectGame(int generatedNumber) {
        if (generatedNumber < 3) {
            LessThan3Game lt3g = new LessThan3Game(userBet);
            return lt3g.calculateWinnings();
        } else if (generatedNumber <= 7) {
            From3To7Game f3t7g = new From3To7Game(userBet);
            return f3t7g.calculateWinnings();
        }
        MoreThan7Game mt1g = new MoreThan7Game(userBet);
        return mt1g.calculateWinnings();
    }

    void printThePrise(double prise) {
        System.out.printf("Your prise is %.2f", prise);
    }
}

