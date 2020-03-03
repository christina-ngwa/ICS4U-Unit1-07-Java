import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
* This program calculates the third measurement of the board.
*
* @author  Christina Ngwa
* @version 1.0
* @since   2020-02-29
*/

public class BoardFootage2 {
  /**
  * This method asks user for the first two measurements of a board.
  */
  public static void main(String[] args) throws IOException {
  
    // variables
    String [] dimensions = new String [3];
    double missing;
    
    // reads user input
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Welcome to the board foot calculator.\n");
    
    // input
    for(int i = 0; i < dimensions.length; i++) {
        System.out.print("Enter a dimension in inches: ");
        dimensions [i] = br.readLine();
    }
    dimensions.removeIf(Objects::isNull);
    assertThat(dimensions, hasSize(2));

    // call method
    converted = boardFoot(dimensions);
    missing = boardFoot(dimensionz);
  
    // output
    System.out.print("\nThe height is " + missing + " inches.");
  }

  /**
  * This method calculates the third measurement of the board.
  */
  public static double boardFoot(String dimensions []) {
    
    // variables
    double [] dimensionz = new double [2];

    // parsing
    for(int i = 0; i < dimensions.length; i++) {
      dimensionz [i] = Double.parseDouble(dimensions [i]);
    }

    return dimensionz;
  }

  /**
  * This method calculates the third measurement of the board.
  */
  public static double boardFoot(double dimensionz []) {
    
    // variables
    double volume = 144;
    double d3 = 0;

    // process
    d3 = volume / dimensionz [0] / dimensionz [1];

    return d3;
  }
}