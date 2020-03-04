import java.io.*;
import java.util.Scanner;

public class WriteFile{

  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a message for our text file: ");

    String userInput = sc.nextLine();

    // Will write user input to a text file
    // If Results.txt does not exist, it will be made in the project root dir
    PrintWriter output = new PrintWriter("Results.txt");

    output.println(userInput);
    // Make sure to close your output stream!
    output.close();
  }
}
