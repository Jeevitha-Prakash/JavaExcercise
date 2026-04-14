/* Write a program that classifies a triangle based on its side lengths. Given three input values
representing the lengths of the sides, determine if the triangle is equilateral (all sides are
equal), isosceles (exactly two sides are equal), or scalene (no sides are equal). Use an
if-else statement to classify the triangle. */

package Excercises;

import java.util.Scanner;

public class TriangleClassifier
{
    public static String triangleType(int side1, int side2, int side3)
    {
        String triangle;
        if((side1 == side2) && (side2 == side3))
        {
            triangle = "Equilateral";
        }
        else if ((side1 == side2) || (side2 == side3) || (side3 == side1))
        {
            triangle = "Isosceles";
        }
        else if((side1 != side2) && (side2 != side3))
        {
            triangle = "Scalene";
        }
        else
        {
            triangle = "Invalid";
        }
        return triangle;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of triangle");
        if(sc.hasNextInt())
        {
            int side1 = sc.nextInt();
            int side2 = sc.nextInt();
            int side3 = sc.nextInt();

            String triangle = triangleType(side1,side2,side3);
            System.out.printf("The triangle is %s", triangle);

        }
        else
        {
            System.out.println("Enter valid number");
        }



    }
}
