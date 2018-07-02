import java.*;
import java.util.*;

public class IsUnique
{
  int count, i;
  String entry;

  Scanner userInput = new Scanner(System.in);

  public void UniqueStringChecker()
  {
    System.out.println("Enter a phrase: ");
    entry = userInput.nextLine();

    for (i = 0; i < entry.length(); i++)
    {
      if(Character.isLetter(entry[i]) == true)
        count++;
    }

    if (count == entry.length())
      System.out.println("String is totally unique.");
    else
      System.out.println("String is not completely unique.");
  }

  public static void main(String[] args)
  {
    UniqueStringChecker();
  }
}
