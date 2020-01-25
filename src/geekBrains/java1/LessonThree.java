package geekBrains.java1;

import java.util.Scanner;

public class LessonThree {
    public static void main(String[] args) {
        guessNumber();
        guessWord();
    }

    public static void guessNumber() {
        exitGame:
        {
            while (true) newGame:{
                System.out.println("Guess the number in between 0 and 9");
                int guesedNumber = (int) (Math.random() * 10);
                int tries = 0;
                while (true) {

                    if (tries == 3) {
                        System.out.println("Game over!!!");
                        System.out.println("Try again?");
                        System.out.println("1.Yes");
                        System.out.println("2.No");
                        Scanner scan2 = new Scanner(System.in);
                        int chooser = scan2.nextInt();
                        if (chooser == 1) {
                            break newGame;
                        } else break exitGame;
                    }

                    System.out.println("Enter the number: ");
                    Scanner scan = new Scanner(System.in);
                    int num = scan.nextInt();
                    if (num > guesedNumber) {
                        System.out.println("Lower!");
                    } else if (num < guesedNumber) {
                        System.out.println("Higher!");
                    } else if (num == guesedNumber) {
                        System.out.println("You win!!!");
                        System.out.println("Try again?");
                        System.out.println("1.Yes");
                        System.out.println("2.No");
                        Scanner scan2 = new Scanner(System.in);
                        int chooser = scan2.nextInt();
                        if (chooser == 1) {
                            break newGame;
                        } else break exitGame;

                    }
                    tries++;
                }
            }
        }

    }

    public static void guessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int index = (int) (Math.random() * words.length);
        String guessedWord = words[index];
        while (true){
            System.out.println("Guess the word:");
            Scanner scan = new Scanner(System.in);
            String yourWord = scan.nextLine().toLowerCase();
            if (yourWord.equals(guessedWord)){
                System.out.println("You win");
                break;
            }
            System.out.println("Wrong! Tips: ");
            System.out.println(guessedWord.substring(0,1) + guessedWord.substring(1,2) + "############# ");

        }

    }
}