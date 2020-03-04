import java.io.*;
import java.util.Random;

public class RandomNumbers{

  public static void main(String[] args) {

    Random rand = new Random();
    int i;

    // Randomly outputs 3 values between 0-10
    for(i=0; i<3; i++){
      System.out.println("Random number from 0-10: "+ rand.nextInt(11));
    }

    // Randomly outputs 3 values between 0-9
    for(i=0; i<3; i++){
      System.out.println("Random number from 0-9: "+ rand.nextInt(10));
    }

    // Randomly outputs 3 values between 1-10
    int nonZero;
    for(i=0; i<3; i++){
      nonZero = rand.nextInt(10) + 1;
      System.out.println("Random number from 1-10: "+ nonZero);
    }

    // A value is randomly selected that will be "removed" from the pool of numbers we can choose from
    int tabooValue = rand.nextInt(5) + 1;
    System.out.println("The next 10 values will NEVER be: "+ tabooValue);

    int approvedValue;
    for(i=0; i<10; i++){
      approvedValue = tabooValue;

      while(approvedValue == tabooValue){
        approvedValue = rand.nextInt(5) + 1;
      }

      System.out.println("Random number from 1-5 (not equal to "+tabooValue+"): "+approvedValue );
    }

  }
}
