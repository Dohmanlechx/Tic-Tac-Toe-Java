package com.dohman;

public class Board {

    private String a1;
    private String a2;
    private String a3;
    private String b1;
    private String b2;
    private String b3;
    private String c1;
    private String c2;
    private String c3;

    public Board() {
        this.a1 = " ";
        this.a2 = " ";
        this.a3 = " ";
        this.b1 = " ";
        this.b2 = " ";
        this.b3 = " ";
        this.c1 = " ";
        this.c2 = " ";
        this.c3 = " ";
    }

    public void printBoard() {
        System.out.println("     \n\t\t\t " + a1 + " | " + a2 + " | " + a3 + "   \n" +
                "     \t\t---+---+---\n" +
                "     \t\t " + b1 + " | " + b2 + " | " + b3 + "   \n" +
                "     \t\t---+---+---\n" +
                "     \t\t " + c1 + " | " + c2 + " | " + c3 + "   \n");
        System.out.println("\t\u00a9" + " TRE I RAD, David Öhman, MA17\n");
    }

    public void resetBoard() {
        this.a1 = " ";
        this.a2 = " ";
        this.a3 = " ";
        this.b1 = " ";
        this.b2 = " ";
        this.b3 = " ";
        this.c1 = " ";
        this.c2 = " ";
        this.c3 = " ";
    }

    public boolean checkWinner(String suit) {
        if (a1.equals(suit) && a2.equals(suit) && a3.equals(suit) ||
                b1.equals(suit) && b2.equals(suit) && b3.equals(suit) ||
                c1.equals(suit) && c2.equals(suit) && c3.equals(suit) ||
                a1.equals(suit) && b1.equals(suit) && c1.equals(suit) ||
                a2.equals(suit) && b2.equals(suit) && c2.equals(suit) ||
                a3.equals(suit) && b3.equals(suit) && c3.equals(suit) ||
                a1.equals(suit) && b2.equals(suit) && c3.equals(suit) ||
                a3.equals(suit) && b2.equals(suit) && c1.equals(suit)) {
            return true;
        }
        return false;
    }

    public boolean evenGameCheck() {
        if (!a1.equals(" ") && !a2.equals(" ") && !a3.equals(" ") &&
                !b1.equals(" ") && !b2.equals(" ") && !b3.equals(" ") &&
                !c1.equals(" ") && !c2.equals(" ") && !c3.equals(" ")) {
            return true;
        }
        return false;
    }

    public boolean setonBoard(String input, String suit) {

        switch (input) {
            case "a1":
                if (this.a1.equals(" ")) {
                    setA1(suit);
                    break;
                } else {
                    return false;
                }
            case "a2":
                if (this.a2.equals(" ")) {
                    setA2(suit);
                    break;
                } else {
                    return false;
                }
            case "a3":
                if (this.a3.equals(" ")) {
                    setA3(suit);
                    break;
                } else {
                    return false;
                }
            case "b1":
                if (this.b1.equals(" ")) {
                    setB1(suit);
                    break;
                } else {
                    return false;
                }
            case "b2":
                if (this.b2.equals(" ")) {
                    setB2(suit);
                    break;
                } else {
                    return false;
                }
            case "b3":
                if (this.b3.equals(" ")) {
                    setB3(suit);
                    break;
                } else {
                    return false;
                }
            case "c1":
                if (this.c1.equals(" ")) {
                    setC1(suit);
                    break;
                } else {
                    return false;
                }
            case "c2":
                if (this.c2.equals(" ")) {
                    setC2(suit);
                    break;
                } else {
                    return false;
                }
            case "c3":
                if (this.c3.equals(" ")) {
                    setC3(suit);
                    break;
                } else {
                    return false;
                }
        }
        return true;
    }

    public void setA1(String suit) {
        this.a1 = suit;
    }

    public void setA2(String suit) {
        this.a2 = suit;
    }

    public void setA3(String suit) {
        this.a3 = suit;
    }

    public void setB1(String suit) {
        this.b1 = suit;
    }

    public void setB2(String suit) {
        this.b2 = suit;
    }

    public void setB3(String suit) {
        this.b3 = suit;
    }

    public void setC1(String suit) {
        this.c1 = suit;
    }

    public void setC2(String suit) {
        this.c2 = suit;
    }

    public void setC3(String suit) {
        this.c3 = suit;
    }
}