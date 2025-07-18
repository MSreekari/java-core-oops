package concepts.classes_and_objects;

// A game for three users, where each user has to guess the number, if the number they guess matches the target number they win.
import java.util.Random;
import java.util.Scanner;

class Player{
    String name;
    int guess;

    public Player(String name){
        this.name = name;
        this.guess = -1;
    }
    public void makeGuess(int guess){
        this.guess = guess;
        System.out.println(name + " is guessing " + guess + ".....");
    }

    public String getName(){
        return name;
    }

    public int getGuess(){
        return guess;
    }
}
class GuessGame{
    Player[] players =  new Player[3];
    int targetNumber;

    public void startGame(Scanner input){
        System.out.println("-----Player Registration-----");
        for (int i = 0; i < players.length; i++) {
            System.out.println("Enter the name for Player " + (i + 1) + " : ");
            String playerName =  input.nextLine();
            players[i] = new Player(playerName);
        }
        Random random = new Random();
        targetNumber = random.nextInt(10);
        System.out.println("I'm thinking of a number between 0 and 9...");
        boolean someoneGuessedCorrectly = false;
        int round = 1;
        while(!someoneGuessedCorrectly){
            System.out.println("-----Round " + round + "-----");
            for(Player player : players){
                System.out.println(player.getName() + ", enter your guess (0-9): ");
                int userguess = input.nextInt();
                input.nextLine();
                player.makeGuess(userguess);
            }
            int correctCount = 0;
            for(Player player : players){
                System.out.println(player.getName() + " guessed " + player.getGuess() + ".");
                if(player.getGuess() == targetNumber){
                    System.out.println(player.getName() + " guessed correctly!");
                    someoneGuessedCorrectly = true;
                    correctCount++;
                }else{
                    System.out.println(player.getName() + " guessed incorrectly.");
                }
            }
            if(!someoneGuessedCorrectly){
                System.out.println("No one guessed correctly in this round. Let's try again!");
            }else{
                System.out.println("\nWe have a winner(s)! The number was " + targetNumber + ".");
            }
            round++;
        }
    }
}
public class GuesstheNumberGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GuessGame game = new GuessGame();
        System.out.println("-----Start Game-----");
        game.startGame(in);
        in.close();
    }
}
