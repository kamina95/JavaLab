/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Lecture4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
//     final int theoryH = 10000;
//     int days;
//     int weeks;
//     weeks = theoryH / 144;
//     days = (theoryH % 144) / 24;
//     System.out.println(weeks + " " + days);
     
//        int number;
//        String type;
//        System.out.println("Introduce a number");
//        number= input.nextInt();
//        if ( number % 2 == 0){
//            type = "even";
//        }else{
//        type = "odd";        
//        }    
//        System.out.println(type);

//      System.out.println((int)( Math.random() * 10));
        
//        final int number1 = (int)(Math.random() * 10);
//        final int number2 = (int)(Math.random() * 10);
//        int result;
//        System.out.println(number1 + " + " + number2 + " =");
//        result = input.nextInt();
//        
//        if (number1 + number2 == result){
//        System.out.println("Correct");
//        }else{
//        System.out.println("Incorrect");
//        }

//        int numberFive;
//        System.out.println("Introduce a number");
//        numberFive = input.nextInt();
//      System.out.println((numberFive % 5 == 0)? "High Five" : "nada");
//        if(numberFive % 5 == 0){
//        System.out.println("High Five");
//        } else if (numberFive % 2 == 0){
//        System.out.println("HiEven");
//        }


//        int n2 = (int)(Math.random() * 10);
//        int n1 = (int)(Math.random() * 10);
//        int number1;
//        int number2;
//        
//        
//        int result;
//        
//        
//        if(n1 < n2){
//            number1 = n2;
//            number2 = n1;
//        } else{
//            number1 = n1;
//            number2 = n2;
//        }
//        
//        System.out.println(number1 + " - " + number2 + " =");
//        result = input.nextInt();
//        
//        if (number1 - number2 == result){
//        System.out.println("Correct");
//        }else{
//        System.out.println("Incorrect");
//        }
        
        
        float weight;
        float height;
        double BMI;
        
        System.out.print("Introduce weight and height: ");
        weight = input.nextFloat();
        height = input.nextFloat();
        
        BMI = (int) weight / Math.pow(height, 2);
        
        if (BMI < 18.5){
        System.out.println(BMI + " Underweight");
        }else if (BMI >= 18.5 && BMI < 25.0){
        System.out.println(BMI + " Normal");       
        }else if (BMI >= 25.0 && BMI < 30.0){
        System.out.println(BMI + " Overweight");
        }else if (BMI >= 30){
        System.out.println(BMI + " Obese");
        }
        
    }
}