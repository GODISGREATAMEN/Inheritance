package game;

import java.util.Scanner;

public class UserBet {
    Scanner scan = new Scanner(System.in);

    double getUserBet() {
        System.out.println("Be aware!!!\nThis game won't make you rich, be careful!\nEnter your bet:");
        while (true) {
            if (scan.hasNextDouble()) {
                double userBet = scan.nextDouble();
                System.out.println("Your bet accepted!");
                return userBet;
            } else {
                System.out.println("You entered something wrong!!!\nEnter again!");
                scan.next();
            }
        }
    }
}
