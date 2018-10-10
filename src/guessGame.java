import java.util.Scanner;

public class guessGame {
    public static void main(String[] args){
        double x = Math.random();
        int num = (int)(x * 101);
        Scanner input = new Scanner(System.in);
        String guess = "";
        System.out.println("Try to guess the number!");
        guess = input.nextLine();
            if (guess < num){
                    System.out.println("Guess higher!");
                    guess = input.nextLine();
            }
            else{
                    System.out.println("Guess lower");
                    guess = input.nextLine();
                }
        }
    }
}
