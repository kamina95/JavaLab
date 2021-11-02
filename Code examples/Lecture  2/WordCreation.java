package lecture_2;

import java.util.Scanner;

/**
 *
 * Exercises prepared basing on the book:
 * “Introduction to Java Programming and Data Structure”
 * Eleventh Edition by Y. Daniel Liang
 */
public class WordCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("enter a letter");
        char  letter1 = sc.next().charAt(0);
        
        System.out.println("enter a letter");
        char  letter2 = sc.next().charAt(0);
        
        System.out.println("enter a letter");
        char  letter3 = sc.next().charAt(0);
        
        System.out.println("enter a letter");
        char  letter4 = sc.next().charAt(0);
        
        System.out.println("enter a letter");
        char  letter5 = sc.next().charAt(0);
        
        System.out.println ("The word is: "+ letter1+letter2+letter3+letter4+letter5 );
        
    }
    
}
