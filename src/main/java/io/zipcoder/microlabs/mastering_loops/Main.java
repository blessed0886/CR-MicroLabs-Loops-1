package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarRide ride = new CarRide();
        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            System.out.println("Are we there yet?");
            userInput = scanner.nextLine();
            ride.areWeThereYet(userInput);
        } while(!"Yes".equals(userInput));
        System.out.println("Good!");
    }
}
