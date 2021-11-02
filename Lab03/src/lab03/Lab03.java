package lab03;

import java.util.Scanner;

public class Lab03 {

    public static void main(String[] args) {

        //Exe2();
        //Exe4();
        //Exe35();
        //Exe17();
        Exe24();
    }

    public static void Exe2() {

        Scanner input = new Scanner(System.in);
        int max = 9;
        int min = 1;
        int range = max - min + 1;
        int first = (int) (Math.random() * range) + min;
        int second = (int) (Math.random() * range) + min;
        System.out.println("The answer to " + first + " * " + second + " is >");

        while (true) {
            int answerOne = input.nextInt();
            if (answerOne == (first * second)) {
                System.out.println("Correct Answer!!!");
                break;
            } else {
                System.out.println("Try again");
            }
        }

    }

    public static void Exe4() {
        int max = 12;
        int min = 1;
        int range = max - min + 1;
        int month = (int) (Math.random() * range) + min;
        System.out.println(month);
        String monthString;
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }

        System.out.println(monthString);

    }

    public static void Exe35() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introducce a number");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is Even");
        } else {
            System.out.println("The number " + number + " is Odd");
        }

    }

    public static void Exe17() {
        Scanner input = new Scanner(System.in);
        System.out.println("scissor(0), rock(1), paper(2).");
        System.out.println("Your play is >>");
        String end = "";
        int playerSelection = input.nextInt();
        int computerSelection = (int) (Math.random() * 3);
        if (playerSelection == 0) {
            switch (computerSelection) {
                case 0:
                    end = "It is a draw";
                    break;
                case 1:
                    end = "Computer Wins";
                    break;
                case 2:
                    end = "You won";
                    break;
            }
        }
         if (playerSelection == 1) {
            switch (computerSelection) {
                case 0:
                    end = "You won";
                    break;
                case 1:
                    end = "It is a draw";
                    break;
                case 2:
                    end = "Computer Wins";
                    break;
            }
        }
          if (playerSelection == 2) {
            switch (computerSelection) {
                case 0:
                    end = "Computer Wins";
                    break;
                case 1:
                    end = "You Won";
                    break;
                case 2:
                    end = "It is a draw";
                    break;
            }
        }
          System.out.println("You played " + playerSelection + " and the computer " + computerSelection);
          System.out.println(end);
    }

    
    public static void Exe24(){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce the number of a card>>");
        int card = input.nextInt();
        int number = (card + 13) % 13;
        int palo = (card -1) /13;
        String rank = "";
        String suit = "";
        
        switch(number){
            case 0: rank = "King";
            break;
            case 1: rank = "Ace";
            break;
            case 12: rank = "Queen";
            break;
            case 11: rank = "Jack";
            break;   
            case 2: rank = "2";
            break;
            case 3: rank = "3";
            break;
            case 4: rank = "4";
            break;
            case 5: rank = "5";
            break;
            case 6: rank = "6";
            break;
            case 7: rank = "7";
            break;
            case 8: rank = "8";
            break;
            case 9: rank = "9";
            break;
            case 10: rank = "10";
            break;
        }
        switch(palo){
            case 0: suit ="Clubs";
            break;
            case 1: suit ="Diamonds";
            break;
            case 2: suit ="Hearts";
            break;
            case 3: suit ="Spades";
            break;
            
        }
        
        System.out.println("The card you picked is " + rank + " of " + suit);
        
        
    }
}
