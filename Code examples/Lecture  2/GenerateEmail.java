package lecture_2;

import java.util.Scanner;

/**
 *
 * Exercises prepared basing on the book:
 * “Introduction to Java Programming and Data Structure”
 * Eleventh Edition by Y. Daniel Liang
 */

/**
 *Create new project where you would generate a student email. 
 * Ask user for the first part of his/her email and concatenate it to the listed below variables in order to create one email.
 */
public class GenerateEmail {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the first part of your email"
                + "\nExample: aw564 ... Enter your input now");
        String firstPartOfEmail = sc.nextLine();
        
        char at = '@';
        String endOfEmail = "live.mdx.ac.uk";
        
        System.out.println("Your student email is: "+firstPartOfEmail+at+endOfEmail);
    }
    
}
