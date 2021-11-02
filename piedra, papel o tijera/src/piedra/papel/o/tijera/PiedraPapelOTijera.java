/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedra.papel.o.tijera;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author anton
 */
public class PiedraPapelOTijera {
    
  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String[] mystring = {
        "rock",
        "paper",
        "scissors"
    };
        int mark1=0;
        int mark2=0;
        while(true){
        String move ="";
        String marker="";

        int idx = new Random().nextInt(mystring.length);
        String random = (mystring [idx]);
        //System.out.println(random);
        System.out.println("introduce rock, paper or scissors: ");
        move = input.next();
        System.out.println(random);
        if(random.equals(move)){
            marker = "tie: ";
        }else if(random.equals("rock") && move.equals("paper")){
            marker = "point for You: ";
            mark1++;
        }else if(random.equals("rock") && move.equals("scissors")){
            marker = "point for machine: ";
            mark2++;
        }else if(random.equals("paper") && move.equals("rock")){
            marker = "point for machine: ";
            mark1++;
        }else if(random.equals("paper") && move.equals("scissors")){
            marker = "point for You: ";
            mark2++;
        }else if(random.equals("scissors") && move.equals("rock")){
            marker = "point for You: ";
            mark2++;
        }else if(random.equals("scissors") && move.equals("paper")){
            marker = "point for machine: ";
            mark1++;
        }else{
            marker = "introduce a proper state: ";
        }
        
        if(mark1 == 3){
            marker ="YOU WIN: ";
            System.out.println(marker + mark1 + " - " + mark2);
            break;
        }else if(mark2 == 3){
            marker ="MACHINE WIN: ";
            System.out.println(marker + mark1 + " - " + mark2);
            break;
        }
        
        System.out.println(marker + mark1 + " - " + mark2);
        }
        
    }
    
  
    
}
