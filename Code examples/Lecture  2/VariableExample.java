package lecture_2;

import java.util.Scanner;

/**
 *
 * Exercises prepared basing on the book:
 * “Introduction to Java Programming and Data Structure”
 * Eleventh Edition by Y. Daniel Liang
 */
public class VariableExample {
     public static void main(String[] args) {
        
        char symbol = 'a';
        System.out.println(symbol);
        
        String word = "Hello";
        System.out.println(word);
        
        System.out.println("Enter a Sentence:");
        Scanner input = new Scanner(System.in);

        System.out.println(input.nextLine());

    }
    
}
