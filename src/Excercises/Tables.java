//Generate a table using printf()
package Excercises;

import java.util.Scanner;
public class Tables
{
    static int num;
    static int table;
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Integer");

        // Edge case: validate input
        if(!sc.hasNextInt())
       {
           System.out.println("Kindly enter the integer");
           return;
       }
       num = sc.nextInt();

        // Edge case: handle negative numbers gracefully
        if(num<0) {
           System.out.println("Negative number entered. Printing table for absolute value.");
           num = Math.abs(num);
       }

        // Print multiplication table from 1 to 10
        for(int i =1; i<=10; i++)
      {
          System.out.printf("%d x %d = %d%n", num, i, num * i);
      }

        // Edge case: special message if N == 0
        if(num==0)
      {
          System.out.println("Note: Multiplication table of 0 is always 0.");
      }

      sc.close();

    }


    }


/*Edge Case: Negative Numbers
- If the user enters a negative number, the program converts it to its absolute value.
- This ensures the multiplication table is meaningful (positive values).

 */