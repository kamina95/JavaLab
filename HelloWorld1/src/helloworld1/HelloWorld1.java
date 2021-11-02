/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworld1;
import java.util.Scanner;


/**
 *
 * @author anton
 */
public class HelloWorld1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("WELCOME TO ");
//        System.out.println("JAVA PROGRAMMING");
//    
//   for (int i = 0; i < 5; i++) {
//            System.out.println("I love Java ");
//        }
//   
//       System.out.println("    J");
//       System.out.println("J  aaa    V     Vaaa");
//       System.out.println("J  J  aa    V V    a a");
//       System.out.println("J   aaaa     V     aaaa");
//      
//       final Object[][] table = new String[5][];
//        table[0] = new String[] { "a", "a^2", "a^3", "a^4" };
//        table[1] = new String[] { "1", "1",   "1",   "1"};
//        table[2] = new String[] { "2", "4",   "8",   "16"};
//        table[3] = new String[] { "3", "9",   "27",  "81" };
//        table[4] = new String[] { "4", "16",  "64",  "256" };
//        
//        for (final Object[] row : table) {
//            System.out.format("%-15s%-15s%-15s%n", row);
//        }
//        
//        System.out.println(((7.5 * 6.5)-(4.5 * 3))/(47.5 - 5.5));
//        
//        int n = 0;
//         for (int i = 1; i < 11; i++) {
//            n = i + n;
//        }
//         System.out.println(n);
//         
//        System.out.println(4*(1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11)));
//        System.out.println(4*(1.0 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + (1/13)));
//        
//        double pi =  3.14159;
//        System.out.println(2 * 6.5 * pi);
//        System.out.println(6.5 * 6.5 * pi);
//        
//        System.out.println(5.3 *8.6);
//        System.out.println(2 * (5.3 + 8.6));
//        
//        System.out.println((15 / 1.6) / (50.5 / 60));
//        
//        System.out.println(312032468 + ((5 * 365 * 24 * 60 *60) / 7) - ((5 * 365 * 24 * 60 *60) / 13) + ((5 * 365 * 24 * 60 *60) / 45));
//        
//        
//        System.out.println((24 * 1.6) / (1 + (40. / 60) + (35.0 / 3600)));
//        
//        System.out.println(((44.5 * 0.55) - (50.2 * 5.9)) / ((3.4 * 5.9) - (50.2 * 2.1)));
//        System.out.println(((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * 0.55) - (50.2 * 2.1)));

//            System.out.println("4" + "4");
//            System.out.println("Hello" + "World");
//            System.out.println("middlesex" + "University");
//            System.out.println('a' + 'b');

Scanner input = new Scanner (System.in);
System.out.println("Your first part of the email");
String name = input.next();
String endOSE = "live.mdx.ac.uk";
char at = '@';
System.out.println(name + at + endOSE);

    }
    
}
    
    


