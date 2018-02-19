package com.dohman;

import java.util.Scanner;

public class TicTacToe {

    private static Scanner sc = new Scanner(System.in);
    private static Board board = new Board();

    public static void main(String[] args) {
        printIntro();

        //Creation of the players/AI
        System.out.print("\t\t\tNamn på spelare X: ");
        String nameX = sc.nextLine();
        Player playerX = new Human(nameX, "X");
        System.out.println("\tVill du spela mot en vän (1) eller AI (Any key)?");
        System.out.print("\n\t\tAnge ditt val och tryck Enter: ");
        String val = sc.nextLine();

        Player playerO;
        if (val.equals("1")) {
            System.out.print("\t\t\tNamn på spelare O: ");
            String nameO = sc.nextLine();
            playerO = new Human(nameO, "O");
        } else {
            playerO = new AI();
        }

        printRules();
        // Resets the game if won or tied
        boolean ifWinOrTie = false;
        // Board printing out
        do {
            showWinInfo(playerX, playerO);
            board.resetBoard();
            board.printBoard();
            // For loop with inputs
            for (int i = 0; i < 5; i++) {
                // X inputting
                String inputX;
                do {
                    inputX = playerX.makeInput();
                } while (!board.setonBoard(inputX, "X"));
                // Checking if X won
                if (board.checkWinner(playerX.getSuit())) {
                    winningGame(playerX);
                    ifWinOrTie = true;
                    break;
                }
                board.printBoard();
                // Checking if tied
                if (board.evenGameCheck()) {
                    System.out.println("\t\tDet blev oavgjort!\n");
                    ifWinOrTie = true;
                    break;
                }
                // O inputting
                String inputO;
                do {
                    inputO = playerO.makeInput();
                } while (!board.setonBoard(inputO, "O"));
                // Checking if O won
                if (board.checkWinner(playerO.getSuit())) {
                    winningGame(playerO);
                    ifWinOrTie = true;
                    break;
                }
                board.printBoard();
            }
        } while (ifWinOrTie);
    }

    // Methods
    public static void printIntro() {
        System.out.println("\t\t  +-------------------------+");
        System.out.println("\t\t  | Välkomna till Tre i Rad |");
        System.out.println("\t\t  +-------------------------+");
        System.out.println("\t\t " + "\u00a9" + " TRE I RAD, David Öhman, MA17\n");
    }

    public static void printRules() {
        System.out.println("\n-------------R E G L E R-------------");
        System.out.println("Den som har tre i rad först vinner omgången." +
                "\nSätt din pjäs på någon av dessa positioner:" +
                "\n\t\t\t a1, a2, a3" +
                "\n\t\t\t b1, b2, b3" +
                "\n\t\t\t c1, c2, c3" +
                "\n\n------------NU BÖRJAR SPELET------------");
    }

    public static void winningGame(Player player) {
        board.printBoard();
        System.out.println("\t***** " + player.getPlayerName() + " vann omgången! *****\n");
        player.gameAddWin();
    }

    public static void showWinInfo(Player playerX, Player playerO) {
        System.out.println("\t\t   " + playerX.getPlayerName() + " " + playerX.getWins() + "-" + playerO.getWins() + " " + playerO.getPlayerName());
    }
}