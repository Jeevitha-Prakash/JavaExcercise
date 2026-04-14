/* Write a program that calculates and displays the letter grade for a given numerical score
(e.g., A, B, C, D, or F) based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
*/

package Excercises;

import java.util.Scanner;

public class GradeCalculator
{
  static  char grade;

    public  static char gradeCalculatorSystem(int score)
    {

        if(score>=90 && score<=100)
        {
           grade ='A';
        }

        else if(score>=80 && score<=89)
        {
            grade = 'B';
        }

        else if(score>=70 && score<=79)
        {
            grade = 'C';
        }

        else if(score>=60 && score<=69)
        {
            grade = 'D';
        }

        else if(score>=0 && score<=59)
        {
            grade = 'F';
        }
        else {
            System.out.println("Invalid");
        }
        return grade;


    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score to see your grade");
        if(sc.hasNextInt())
        {
          int score = sc.nextInt();

           grade =  gradeCalculatorSystem(score);

           System.out.printf("The grade of the student is %c" , grade );
        }
        else
        {
            System.out.println("Please enter the valid score");
        }





    }

}
