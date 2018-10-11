import java.util.Scanner;

public class guessGame {
    public static void main(String[] args){
        double x = Math.random();
        int num = (int)(x * 101);
        int tracker = 0;
        Scanner name = new Scanner(System.in);
        System.out.println("Welcome to the guess game! Please enter your name to begin.");

        Scanner input = new Scanner(System.in);
        System.out.println("Try to guess the number!");
        int guess = input.nextInt();
        tracker ++;
        while (num != guess){
            if (guess < num){
                    System.out.println("Guess higher!");
                    guess = input.nextInt();
                    tracker++;
            }
            else{
                    System.out.println("Guess lower");
                    guess = input.nextInt();
                    tracker++;
                }
        }
        System.out.println("You got it! The number is: " + num);
        System.out.println("It took you " + tracker + " tries to guess the number!");
    }
}
