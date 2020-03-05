import java.io.*;
import java.util.Random;

public class GameShow{

  public static void main(String[] args) throws IOException{

    int trials = 10000;

    int prizeDoor = 0;
    int contestantChoice = 0;
    int otherDoorChoice = 0;
    int revealedDoor = 0;

    int switchWins = 0;
    int stayWins = 0;

    Random rand = new Random();

    for(int i=0; i<trials; i++) {
      // Prize door is selected at random
      // rand selects from 0-2 randomly, then we add 1 to give us Door 1, 2, 3
      prizeDoor = rand.nextInt(3) + 1;

      // Contestant chooses door
      contestantChoice = rand.nextInt(3) + 1;

      // Host reveals a non-prize door. Cannot be the contestant door either
      revealedDoor = prizeDoor;
      while((revealedDoor == prizeDoor)||(revealedDoor == contestantChoice)) {
        revealedDoor = rand.nextInt(3) + 1;
      }

      // Contestant switches door choice. Cannot be previous door choice OR the revealed door
      otherDoorChoice = revealedDoor;
      while((otherDoorChoice == revealedDoor)||(otherDoorChoice == contestantChoice)) {
        otherDoorChoice = rand.nextInt(3) + 1;
      }

      // Count wins when contestant stays with original choice
      if(contestantChoice == prizeDoor) {
        stayWins++;
      }
      // Count wins when contestant switches door choice
      if(otherDoorChoice == prizeDoor) {
        switchWins++;
      }
    }

    PrintWriter output = new PrintWriter("Results.txt");

    output.println("The number of wins when you switched was: " + switchWins);
    output.println("The percentage of wins when you switched was: "+ 100.0 * switchWins / trials +"%");
    output.println("The number of wins when you stayed was: " + stayWins);
    output.println("The percentage of wins when you stayed was: "+ 100.0 * stayWins / trials +"%");

    // Make sure to close your output stream!
    output.close();
  }
}
