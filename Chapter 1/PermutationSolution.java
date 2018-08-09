// 1.2: Check Permutation

import java.*;
import java.util.*;

public class PermutationSolution
{
  public static boolean checkPermutation(String str1, String str2)
  {
    // Check length first
    if(str1.length() != str2.length())
      return false;

    // Convert both arrays to char array so you can sort them
    char tempStr1[] = str1.toCharArray();
    char tempStr2[] = str2.toCharArray();

    // Now sor the two arrays so the letters should line up
    Arrays.sort(tempStr1);
    Arrays.sort(tempStr2);

    // Compare the arrays
    if(Arrays.equals(tempStr1, tempStr2))
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a word: ");
    String str1 = input.nextLine();

    System.out.println("Enter a word: ");
    String str2 = input.nextLine();

    boolean answer = checkPermutation(str1, str2);
    System.out.println("Is it a permutation?" + answer);

  }
}
