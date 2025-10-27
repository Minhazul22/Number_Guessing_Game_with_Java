import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Random rand = new Random(); //object creation
        int randomNumber = rand.nextInt(100)+1; //random number generation
        Scanner input = new Scanner(System.in);
        int numberOfAttempts = 0; //counter for the numberOfAttempts


        System.out.println("Welcome to Number guessing game.\n Rules: Guess a number between 1 and 100.\n" +
                "Until you guess the correct number you will be repeatedly ask to guess the target number\n" +
                "Our game's program generates a random number between 1-100.\nThe goal is to match your guessed number with the generated random number.");



while(true){
    System.out.println("Let's start!\n Guess a Number between 1-100");
    int guess = input.nextInt();
    numberOfAttempts++;

        if (guess == randomNumber){
            System.out.println("You guessed it!");
            System.out.println("Number of attempts: " + numberOfAttempts);
            break;
        } else if (guess < randomNumber) {
            System.out.println("Too small!");

        } else  {
            System.out.println("Too big!");

        }
}

    }
}


