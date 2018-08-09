// 1.3: URLify

import java.*;
import java.util.*;

public class urlSolution
{
  public static String urlSolution(String input)
  {
    // ArrayList that holds all the int location of all the spaces in the inputted string
    ArrayList<Integer> spaces = new ArrayList<Integer>();

    // Convert input to char array
    char tempArray[] = input.toCharArray();

    for(int i = 0; i < input.length(); i++)
    {
      char character = input[i];
      int ascii = character;

      if(ascii == 32)
        spaces.add(i);
    }

    StringBuilder outputURL = new StringBuilder(input);

    for(int j : spaces)
    {
      outputURL.insert(j, '%20');
    }

    return outputURL;
  }

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a phrase: ")
    String userinput = input.nextLine();

    String output = urlSolution(userinput);
    System.out.prinln("URLified: " + output);
  }
}
