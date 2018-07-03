import java.*;
import java.util.*;

public class IsUnique
{
  public static void main(String[] args)
  {
    boolean checker;
    checker = uniqueString();

    if (checker == true)
      System.out.println("This string is unique");
    else{
      System.out.println("This string is not unique");
    }
  }

  public static boolean uniqueString()
  {
    String entry;
    int value;
    int i;

    // Scanner instance to read user input
    Scanner userInput;
    userInput = new Scanner(System.in);

    // Get user input
    System.out.println("Enter a string: ");
    entry = userInput.nextLine();

    // Convert string to an array
    char[] arrayentry = entry.toCharArray();

    // Loop through each letter and if keep a flag thats false as long as each letter is different
    boolean[] char_set = new boolean[128];

    for (i = 0; i < entry.length(); i++)
    {
      value = entry.charAt(i);
      if(char_set[value])
        return false;
      char_set[value] = true;
    }

    return true;
  }
}
