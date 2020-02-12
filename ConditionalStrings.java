import java.io.*;
import java.util.Scanner;

public class ConditionalStrings {
  public static void main(String[] args){

    // Declare scanner for i/o
    Scanner sc = new Scanner(System.in);

    // Declare strings for comparison
    String word1 = "apple";
    String word2 = "banana";
    String word3 = "coconut";
    String word4 = "coconut";


    // Comparing strings
    if (word1.compareTo(word2) < 0) {
      System.out.println("Apple comes before banana!");
      // since apple (word1) comes before banana (word2), result is negative
      // condition says: if the result is negative (< 0), we continue!
    }

    if (word3.compareTo(word2) > 0) {
      System.out.println("Coconut comes after banana!");
      // since coconut (word3) comes after banana (word2), result is positive (> 0)
      // if statement is triggered since the inside condition is true
    }

    if (word3.compareTo(word3) == 0) {
      System.out.println("Coconut is coconut!");
      // since coconut matches coconut, result is zero
      // condition is true, so we execute the inside command
    }


    // Changing conditions
    if (word1.compareTo(word2) > 0) {
      System.out.println("No one can hear meeeee");
      // since apple (word1) comes before banana (word2), result is negative
      // condition is met when comparison result is POSITIVE, so we skip this command
    }

    if (word3.compareTo(word2) < 0) {
      System.out.println("Please listen to meeeee");
      // since coconut (word3) comes after banana (word2), result is positive (> 0)
      // if statement is triggered when comparison result is NEGATIVE, so we skip this too
    }

    if (word3.compareTo(word3) != 0) {
      System.out.println("AHHHHHHHHH");
      // since coconut matches coconut, result is zero
      // condition is false, so we do not execute the inside command
    }


  }
}
