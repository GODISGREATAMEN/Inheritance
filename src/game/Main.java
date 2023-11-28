package game;

public class Main {
    public static void main(String[] args) {
        UserBet userBet = new UserBet();
        Number number = new Number();
        double bet = userBet.getUserBet();
        Game game = new Game(bet);
        int generatedNumber = number.generateNumber();
        double prise = game.chooseCorrectGame(generatedNumber);
        game.printThePrise(prise);
        number.printGeneratedNumber(generatedNumber);
    }
}
