package com.dohman;

import java.util.Scanner;

public class Human extends Player {

    private Scanner sc = new Scanner(System.in);

    public Human(String playerName, String suit) {
        super(playerName, suit);

    }

    @Override
    public String makeInput() {
        String input;
        do {
            System.out.print("\t  " + getPlayerName() + " (" + this.getSuit() + "), ange position: ");
            input = sc.nextLine();
        } while (!checkInput(input));
        return input;
    }
}