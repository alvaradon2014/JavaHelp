import java.io.*;
import java.util.Scanner;

public class CompareStrings{
  public static void main(String[] args){

    // Declare scanner for i/o
    Scanner sc = new Scanner(System.in);

    // Declare strings for comparison
    String word1 = "apple";
    String word2 = "banana";
    String word3 = "coconut";
    String word4 = "coconut";

    // compareTo usage:
      // SYNTAX to compare string1 to string2 : string1.compareTo(string2)

      // RESULT if string1 comes before string2 is NEGATIVE
        // (string1 < string2), result is < 0
        System.out.println("string1: " + word1);
        System.out.println("string2: " + word2);
        System.out.println("Comparing string1 to string2: " + word1.compareTo(word2));
          // result is negative because "apple" comes before "banana"

      // RESULT if string1 comes after string2 is POSITIVE
        // (string1 > string2), result is > 0
        System.out.println("string1: " + word3);
        System.out.println("string2: " + word2);
        System.out.println("Comparing string1 to string2: " + word3.compareTo(word2));
          // result is positive because "coconut" comes after "banana"

      // RESULT if string1 and string2 are the same is ZERO
        // (string1 == string2), result is 0
        System.out.println("string1: " + word3);
        System.out.println("string2: " + word4);
        System.out.println("Comparing string1 to string2: " + word3.compareTo(word4));
          // result is zero because "coconut" is the same as "coconut"

        System.out.println("string1: " + word3);
        System.out.println("string1: " + word3);
        System.out.println("Comparing string1 to string1: " + word3.compareTo(word3));
            // comparing a string to itself results in zero too!

  }
}
