import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
* This program calculates the height of the board.
*
* @author  Christina Ngwa
* @version 1.0
* @since   2020-02-29
*/

public class BoardFootage {
  /**
  * This method asks user for the first two measurements of a board.
  */
  public static void main(String[] args) throws IOException {
  
    // variables
    double w;
    double l;
    final double height;
    
    // reads user input
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Welcome to the board foot calculator.\n");
    
    // input
    while (true) {
      System.out.print("Enter length in inches: ");
      try {
        l = Double.parseDouble(br.readLine());
        if (l > 0) {
          break;
        } else {
          System.out.println("Please enter a positive number.");
        }
      } catch (NumberFormatException nfe) {
        System.out.println("Invalid input. Please try again.");
      }
    }

    while (true) {
      System.out.print("Enter width in inches: ");
      try {
        w = Double.parseDouble(br.readLine());
        if (w > 0) {
          break;
        } else {
          System.out.println("Please enter a positive number.");
        }
      } catch (NumberFormatException nfe) {
        System.out.println("Invalid input. Please try again.");
      }
    }

    // call method
    height = boardFoot(l, w);
  
    // output
    System.out.print("\nThe height is " + height + " inches.");
  }

  /**
  * This method calculates the height of the board.
  */
  public static double boardFoot(double l, double w) {
    
    // variables
    double volume = 144;
    double h = 0;

    // process
    h = (volume / l) / w;

    return h;
  }
}