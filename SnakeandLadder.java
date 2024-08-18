import java.util.*;

public class SnakeandLadder {

    static int randomNumber = 0;
    static int score1 = 0;
    static int score2 = 0;
    static int score3 = 0;
    static int score4 = 0;

    public static int player1chance(int add1) {
        randomNumber = (int) (Math.random() * 6) + 1;
        add1 = add1 + randomNumber;
        return add1;
    }

    public static int player2chance(int add2) {
        randomNumber = (int) (Math.random() * 6) + 1;
        add2 = add2 + randomNumber;
        return add2;
    }

    public static int player3chance(int add3) {
        randomNumber = (int) (Math.random() * 6) + 1;
        add3 = add3 + randomNumber;
        return add3;
    }

    public static int player4chance(int add4) {
        randomNumber = (int) (Math.random() * 6) + 1;
        add4 = add4 + randomNumber;
        return add4;
    }

    public static void isSnakeBitePlayer1() {
        if (score1 == 17) {
            System.out.println("player1 is bite by Snake at 17");
            System.out.println("Now your are at 7 player1");
            score1 = 7;
        } else if (score1 == 54) {
            System.out.println("player1 is bite by Snake at 54");
            System.out.println("Now your are at 34 player1");
            score1 = 34;
        } else if (score1 == 62) {
            System.out.println("player1 is bite by Snake at 62");
            System.out.println("Now your are at 19 player1");
            score1 = 19;
        } else if (score1 == 64) {
            System.out.println("player1 is bite by Snake at 64");
            System.out.println("Now your are at 60 player1");
            score1 = 60;
        } else if (score1 == 87) {
            System.out.println("player1 is bite by Snake at 87");
            System.out.println("Now your are at 36 player1");
            score1 = 36;
        } else if (score1 == 93) {
            System.out.println("player1 is bite by Snake at 93");
            System.out.println("Now your are at 73 player1");
            score1 = 73;
        } else if (score1 == 95) {
            System.out.println("player1 is bite by Snake at 95");
            System.out.println("Now your are at 75 player1");
            score1 = 75;
        } else if (score1 == 98) {
            System.out.println("player1 is bite by Snake at 98");
            System.out.println("Now your are in at player1");
            score1 = 79;
        }
    }

    public static void isSnakeBitePlayer2() {
        if (score2 == 17) {
            System.out.println("player2 is bite by Snake at 17");
            System.out.println("Now your are at 10 player2");
            score2 = 7;
        } else if (score2 == 54) {
            System.out.println("player2 is bite by Snake at 54");
            System.out.println("Now your are at 34 player2");
            score2 = 34;
        } else if (score2 == 62) {
            System.out.println("player2 is bite by Snake at 62");
            System.out.println("Now your are at 19 player2");
            score2 = 19;
        } else if (score2 == 64) {
            System.out.println("player2 is bite by Snake at 64");
            System.out.println("Now your are at 60 player2");
            score2 = 60;
        } else if (score2 == 87) {
            System.out.println("player2 is bite by Snake at 87");
            System.out.println("Now your are at 36 player2");
            score2 = 36;
        } else if (score2 == 93) {
            System.out.println("player2 is bite by Snake at 93");
            System.out.println("Now your are at 73 player2");
            score2 = 73;
        } else if (score2 == 95) {
            System.out.println("player2 is bite by Snake at 95");
            System.out.println("Now your are at 75 player2");
            score2 = 75;
        } else if (score2 == 98) {
            System.out.println("player2 is bite by Snake at 98");
            System.out.println("Now your are at 79 player2");
            score2 = 79;
        }
    }

    public static void isSnakeBitePlayer3() {
        if (score3 == 17) {
            System.out.println("player3 is bite by Snake at 17");
            System.out.println("Now your are at 7 player3");
            score3 = 7;
        } else if (score3 == 54) {
            System.out.println("player3 is bite by Snake at 54");
            System.out.println("Now your are at 34 player3");
            score3 = 34;
        } else if (score3 == 62) {
            System.out.println("player3 is bite by Snake at 62");
            System.out.println("Now your are at 19 player3");
            score3 = 19;
        } else if (score3 == 64) {
            System.out.println("player3 is bite by Snake at 64");
            System.out.println("Now your are at 60 player3");
            score3 = 60;
        } else if (score3 == 87) {
            System.out.println("player3 is bite by Snake at 87");
            System.out.println("Now your are at 36 player3");
            score3 = 36;
        } else if (score3 == 93) {
            System.out.println("player3 is bite by Snake at 93");
            System.out.println("Now your are at 73 player3");
            score3 = 73;
        } else if (score3 == 95) {
            System.out.println("player3 is bite by Snake at 95");
            System.out.println("Now your are at 75 player3");
            score3 = 75;
        } else if (score3 == 98) {
            System.out.println("player3 is bite by Snake at 98");
            System.out.println("Now your are at 79 player3");
            score3 = 79;
        }
    }

    public static void isSnakeBitePlayer4() {
        if (score4 == 17) {
            System.out.println("player4 is bite by Snake at 17");
            System.out.println("Now your are at 7 player4");
            score4 = 7;
        } else if (score4 == 54) {
            System.out.println("player4 is bite by Snake at 54");
            System.out.println("Now your are at 34 player4");
            score4 = 34;
        } else if (score4 == 62) {
            System.out.println("player4 is bite by Snake at 62");
            System.out.println("Now your are at 19 player4");
            score4 = 19;
        } else if (score4 == 64) {
            System.out.println("player4 is bite by Snake at 64");
            System.out.println("Now your are at 60 player4");
            score4 = 60;
        } else if (score4 == 87) {
            System.out.println("player4 is bite by Snake at 87");
            System.out.println("Now your are at 36 player4");
            score4 = 36;
        } else if (score4 == 93) {
            System.out.println("player4 is bite by Snake at 93");
            System.out.println("Now your are at 73 player4");
            score4 = 73;
        } else if (score4 == 95) {
            System.out.println("player4 is bite by Snake at 95");
            System.out.println("Now your are at 75 player4");
            score4 = 75;
        } else if (score4 == 98) {
            System.out.println("player4 is bite by Snake at 98");
            System.out.println("Now your are at 79 player4");
            score4 = 79;
        }
    }

    public static void climbLadder1() {
        if (score1 == 4) {
            System.out.println("player1 is now at 37 by climbing the ladder");
            score1 = 37;
        } else if (score1 == 9) {
            System.out.println("player1 is now at 31 by climbing the ladder");
            score1 = 31;
        } else if (score1 == 21) {
            System.out.println("player1 is now at 42 by climbing the ladder");
            score1 = 42;
        } else if (score1 == 40) {
            System.out.println("player1 is now at 58 by climbing the ladder");
            score1 = 58;
        } else if (score1 == 28) {
            System.out.println("player1 is now at 84 by climbing the ladder");
            score1 = 84;
        } else if (score1 == 51) {
            System.out.println("player1 is now at 67 by climbing the ladder");
            score1 = 67;
        } else if (score1 == 72) {
            System.out.println("player1 is now at 91 by climbing the ladder");
            score1 = 91;
        } else if (score1 == 80) {
            System.out.println("player1 is now at 97 by climbing the ladder");
            score1 = 97;
        }
    }

    public static void climbLadder2() {
        if (score2 == 4) {
            System.out.println("player2 is now at 37 by climbing the ladder");
            score2 = 37;
        } else if (score2 == 9) {
            System.out.println("player2 is now at 31 by climbing the ladder");
            score2 = 31;
        } else if (score2 == 21) {
            System.out.println("player2 is now at 42 by climbing the ladder");
            score2 = 42;
        } else if (score2 == 28) {
            System.out.println("player2 is now at 84 by climbing the ladder");
            score2 = 84;
        } else if (score2 == 40) {
            System.out.println("player2 is now at 58 by climbing the ladder");
            score2 = 58;
        } else if (score2 == 51) {
            System.out.println("player2 is now at 67 by climbing the ladder");
            score2 = 67;
        } else if (score2 == 72) {
            System.out.println("player2 is now at 91 by climbing the ladder");
            score2 = 91;
        } else if (score2 == 80) {
            System.out.println("player2 is now at 97 by climbing the ladder");
            score2 = 97;
        }
    }

    public static void climbLadder3() {
        if (score3 == 4) {
            System.out.println("player3 is now at 37 by climbing the ladder");
            score3 = 37;
        } else if (score3 == 9) {
            System.out.println("player3 is now at 31 by climbing the ladder");
            score3 = 31;
        } else if (score3 == 21) {
            System.out.println("player3 is now at 42 by climbing the ladder");
            score3 = 42;
        } else if (score3 == 28) {
            System.out.println("player3 is now at 84 by climbing the ladder");
            score3 = 84;
        } else if (score3 == 40) {
            System.out.println("player3 is now at 58 by climbing the ladder");
            score3 = 58;
        } else if (score3 == 51) {
            System.out.println("player3 is now at 67 by climbing the ladder");
            score3 = 67;
        } else if (score3 == 72) {
            System.out.println("player3 is now at 91 by climbing the ladder");
            score3 = 91;
        } else if (score3 == 80) {
            System.out.println("player3 is now at 97 by climbing the ladder");
            score3 = 97;
        }
    }

    public static void climbLadder4() {
        if (score4 == 4) {
            System.out.println("player4 is now at 37 by climbing the ladder");
            score4 = 37;
        } else if (score4 == 9) {
            System.out.println("player4 is now at 31 by climbing the ladder");
            score4 = 31;
        } else if (score4 == 21) {
            System.out.println("player4 is now at 42 by climbing the ladder");
            score4 = 42;
        } else if (score4 == 28) {
            System.out.println("player4 is now at 84 by climbing the ladder");
            score4 = 84;
        } else if (score4 == 40) {
            System.out.println("player4 is now at 58 by climbing the ladder");
            score4 = 58;
        } else if (score4 == 51) {
            System.out.println("player4 is now at 67 by climbing the ladder");
            score4 = 67;
        } else if (score4 == 72) {
            System.out.println("player4 is now at 91 by climbing the ladder");
            score4 = 91;
        } else if (score4 == 80) {
            System.out.println("player4 is now at 97 by climbing the ladder");
            score4 = 97;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (score1 <= 100 && score2 <= 100 && score3 <= 100 && score4 <= 100) {
            System.out.println("Player1, Press Enter to roll the dice");
            sc.nextLine();
            score1 = player1chance(score1);
            System.out.println("Rolled : " + randomNumber + " Current Score : " + score1 + " By player1\n");
            System.out.println("Now your turn player2");
            sc.nextLine();
            if (score1 >= 100) {
                System.out.println("Game is Ended, No can Enter, to roll the dice");
                System.out.print("Enter your name player1 :");
                String name1 = sc.nextLine();
                System.out.println("You win the game : " + name1);
                break;
            }
            isSnakeBitePlayer1();
            climbLadder1();

            System.out.println("Player2, Press Enter to roll the dice");
            sc.nextLine();
            score2 = player2chance(score2);
            System.out.println("Rolled : " + randomNumber + " Current Score : " + score2 + " By player2\n");
            System.out.println("Now your turn player3");
            sc.nextLine();
            if (score2 >= 100) {
                System.out.println("Game is Ended, No can Enter, to roll the dice");
                System.out.print("Enter your name player2 :");
                String name2 = sc.nextLine();
                System.out.println("You win the game : " + name2);
                break;
            }
            isSnakeBitePlayer2();
            climbLadder2();

            System.out.println("Player3, Press Enter to roll the dice");
            sc.nextLine();
            score3 = player3chance(score3);
            System.out.println("Rolled : " + randomNumber + " Current Score : " + score3 + " By player3\n");
            System.out.println("Now your turn player4");
            sc.nextLine();
            if (score3 >= 100) {
                System.out.println("Game is Ended, No can Enter, to roll the dice");
                System.out.print("Enter your name player3 :");
                String name3 = sc.nextLine();
                System.out.println("You win the game : " + name3);
                break;
            }
            isSnakeBitePlayer3();
            climbLadder3();

            System.out.println("Player4, Press Enter to roll the dice");
            sc.nextLine();
            score4 = player4chance(score4);
            System.out.println("Rolled : " + randomNumber + " Current Score : " + score4 + " By player4\n");
            System.out.println("Now your turn player1");
            sc.nextLine();
            if (score4 >= 100) {
                System.out.println("Game is Ended, No can Enter, to roll the dice");
                System.out.print("Enter your name player4 :");
                String name4 = sc.nextLine();
                System.out.println("You win the game : " + name4);
                break;
            }
            isSnakeBitePlayer4();
            climbLadder4();
        }
    }
}