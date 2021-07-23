package alphabetize;
import java.util.Scanner;

public class Alphabetize {
  public static void main(String[] args) {
    // ---VARIABLE DECLARATION AND INITIALIZATION SECTION----
    Scanner keyboardinput = new Scanner(System.in);
    String word1 = null, word2 = null;
    int alpha = 0;
    
    //---USER INPUT SECTION ------------------------
    System.out.println("Please enter a word:");
    word1 = keyboardinput.next();
    System.out.println("Please enter another word:");
    word2 = keyboardinput.next();
    System.out.println("\n \n \n");
    
    //---PROGRAM EXECUATION-------------------------
    alpha = word1.compareToIgnoreCase(word2); // returns an integer value dependent on alphabetical order
    if (alpha < 0) {
      System.out.printf("%s is alphabetically before %s \n", word1, word2);
    }
    else if (alpha > 0) {
      System.out.printf("%s is alphabetically after %s \n", word1, word2);
    }
    else {
      System.out.printf("%s is really the same as %s \n", word1, word2);
    }
  } //--------------end of main() method---------------
}//-------------end of class Alphabetize---------------
