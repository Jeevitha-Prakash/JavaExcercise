package Excercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excercise1
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try {
            // Integer input
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();

            // Double input
            System.out.print("Enter a double: ");
            double d = sc.nextDouble();

            // Consume leftover newline
            sc.nextLine();

            // String input
            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();

            // Output results
            System.out.println("\n--- Results ---");
            System.out.println("Integer: " + num);
            System.out.println("Double: " + d);
            System.out.println("Sentence: " + sentence);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input type! Please enter the correct data type.");
        } finally {
            sc.close();
        }




    }
}
