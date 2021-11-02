/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Lab04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ascii();
        //vowCons();
        //keypad();
        int x = 7; int y = 4; int z = 9;

      if(
        
((x > y)||(z < y))){
          System.out.println("este");
      }


}
        
    

  
    public static void ascii() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char letter;
        letter = input.next().charAt(0);
        int ascii = (int) letter;
        System.out.println("The ASCII code for character " + letter + " is " + ascii);

    }

    public static void vowCons() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce a character: ");
        char ch = input.next().charAt(0);
        String type = "consonant";
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            type = "Vowel";
        }
        System.out.println("The letter " + ch + " is a " + type);
    }

    public static void keypad() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char letter;
        letter = input.next().charAt(0);
        char ch =  Character.toLowerCase(letter);
        int ascii = (int) ch;
        
        int keyNumber = ((ascii - 97)/ 3) + 2;
        System.out.println(keyNumber);
        
    }

}
