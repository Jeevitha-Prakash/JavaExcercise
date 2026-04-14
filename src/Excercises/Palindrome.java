package Excercises;

import java.util.Scanner;

public class Palindrome
{

    /* public static boolean palindrome(String word)
    {
        //Normalize the string
        // Remove non-alphanumeric characters and convert to lowercase
        word = word.toLowerCase();

        //Use Loop to reverse the String
        String rev ="";
        for(int i= word.length()-1; i>=0; i--)
        {
            rev = rev + word.charAt(i);
        }

        return rev.equals(word);
    }
*/

    public static boolean palindrome1(String word)
    {
        //convert word to Lowercase
        word = word.toLowerCase();

        int i=0, j=word.length()-1;
        while(i<j)
        {
            if(word.charAt(i)!=word.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public static void main(String[] args)
    {
        //Initializing scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thE String");
        String word =  sc.nextLine();

       //boolean result =  palindrome(word);
        boolean result = palindrome1(word);
        if(result)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }

    }
}
