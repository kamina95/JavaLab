/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class CourseWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Exe1();
        //Exe5();
        //Exe6();
        //Exe7();
        //Exe14();
    }

    public static void Exe1() {
        Scanner input = new Scanner(System.in);
        double miles;

        System.out.print("Enter miles: ");
        miles = input.nextDouble();
        System.out.println(miles + " miles are " + (miles * 1.6) + "km");
    }

    public static void Exe5() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce a price and a gratitud: ");
        double price = input.nextDouble();
        double gratuity = input.nextDouble();
        System.out.println("the gratuity is " + (gratuity / 100) * price
                + " and the total is " + ((gratuity / 100) * price + price));
    }

    public static void Exe6() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce a number: ");
        int total = input.nextInt();
        int result = 1;
        while (total != 0) {
            result = result * (total % 10);
            total = total / 10;
        }
        System.out.println("The result is " + result);
    }

    public static void Exe7() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce a number of minutes: ");
        long total = input.nextLong();
        int years = (int) total / (365 * 24 * 60);
        int days = (int) (total % (365 * 24 * 60)) / (60 * 24);
        System.out.println(total + " minutes is approximately "
                + years + " years and " + days + " days");

    }

    public static void Exe14() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce your weight on pounds: ");
        double weight = input.nextDouble();
        System.out.println("Introduce your height: ");
        Double height = input.nextDouble();
        weight = weight * 0.45359237;
        height = height * 0.0254;
        
        System.out.println("BMI is " + (weight/(height*height)));
            
    }

}
