package game;

import java.util.Random;

public class Number {
    Random random = new Random();

    int generateNumber() {
        return random.nextInt(11);
    }

    void printGeneratedNumber(int generatedNumber) {
        System.out.printf("\nThe generated number for you was: %d", generatedNumber);
    }

}
