import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNumber, guess = 0;//guess is initialized to 0

        secretNumber = 123;

        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.print("Enter the number: ");
        guess = keyboard.nextInt();

        while ( guess != secretNumber || guess == 5)
        {
            if(guess == 5){
                System.out.println("\nYou are wrong. Enough is enough.");
                break;
            }
            else{
                System.out.println("\nYou are wrong. Try again.");
                System.out.print("Enter the number: ");
                guess = keyboard.nextInt();
            }

        }

        if(guess == 5){
            System.out.println("However, You get a reward for T . R . Y . I . N . G ...");
        }
        else{
            System.out.println("You are correct. You win a prize!");
        }
        keyboard.close();
    }
}
