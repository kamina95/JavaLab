/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler1;
import java.math.BigInteger;

/**
 *
 * @author anton
 */
public class ProjectEuler1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //EulerMulti1();
        //EulerFibonacci2();
        //EulerPrime3();
        //EulerPalindrome4();
        //Euler0to20Divisible5();
        //EulerSquare6();
        //EulerPrime7();
        //EulerMil8(); probeeemmmmm!!!!!!!!!!!!!!!!
        //EulerPitagoras9();
        //EulerPrimeSum10();
        //EulerTriangleNumbers12();
        //EulerCollazSequence14();
        //EulerPowerMil16();  No resueltoooo
        EulerFactorial20();
    }
    public static void EulerMulti1(){
           int result = 0;
        for(int i = 1; i<1000; i++){
            if(i%3==0){
                result = result + i;
            }else if(i%5==0){
                result = result + i;
            }
        }
       System.out.println(result);
        
    }
    public static void EulerFibonacci2(){
        int result = 1;
        int j = 1;
        int fin = 0;
        
          for(int i = 0; i<4000000;){
                           
              result = i + j;
              System.out.println(result);
              if(result%2==0){
                  fin = fin + result;
              }
              j = i;
              i = result;
          }
          System.out.println("El resultado es: " + fin);
    }
    
    
    public static void EulerPrime3(){
        long start;
        start = 600851475143L;
        
        int fin = 0;
        while(!(start == 1)){
            int n = 2;
            while(!(start%n==0)){
                n++;        
            }
            //System.out.println(n);
            if(n > fin){
                fin = n;
            }
            start = start / n;
            
                }
        System.out.println(fin);
        
        }
    
    public static void EulerPalindrome4(){
                
        
      
        int fin = 0;
        for (int i = 1; i < 1000; i++){
            for(int j = 1; j < 1000; j++){
        // store the number to originalNum
                int reversedNum = 0, remainder;
                int num = i * j;
                int originalNum = num;

            // get the reverse of originalNum
            // store it in variable
                while (num !=0) {
                  remainder = num % 10;
                  reversedNum = reversedNum * 10 + remainder;
                  num /= 10;
                }
                if(originalNum == reversedNum && originalNum > fin) {
                 fin = originalNum;
                }  
                //System.out.println("h");
            }
        }
        System.out.println(fin);
        
        
    }
    public static void Euler0to20Divisible5(){
        int num =1;
        int cheker = 0;
      //System.out.println(80%3);
        while(cheker == 0){
            for (int i = 2;i<=20;i++){
                int rest = num / i;
                if(num % i != 0){ 
                    num++;
                    break;
                }else if(i == 20){
                    System.out.println(num);
                    cheker = 1;
                    break;

                }
            }

        }   
    }
    public static void EulerSquare6(){
        int result1 = 0;
        int result2 = 0;
        for(int i = 0; i<=100; i++){
            int square = i * i;
            result1 = result1 + square;       
        }
        for(int i = 0; i<=100; i++){
            int sum = i;
            result2 = result2 + sum;       
        }
        System.out.println((result2 * result2) - result1);
    }
    
    public static void EulerPrime7(){
        int position = 1;
        int num =2;
        //
        while(position != 10002){
            for(int i = 2; i<=num;i++){
               if(num == i){
                    num= num + 1;
                    position = position + 1;
                    System.out.println(position); 
                    break;
                }else if(num%i == 0){
                    num= num + 1;
                    break;
                }
        }      
        }
         System.out.println(num);
    }
    public static void EulerMil8(){
        
        String num =    "73167176531330624919225119674426574742355349194934\n" +
                        "96983520312774506326239578318016984801869478851843\n" +
                        "85861560789112949495459501737958331952853208805511\n" +
                        "12540698747158523863050715693290963295227443043557\n" +
                        "66896648950445244523161731856403098711121722383113\n" +
                        "62229893423380308135336276614282806444486645238749\n" +
                        "30358907296290491560440772390713810515859307960866\n" +
                        "70172427121883998797908792274921901699720888093776\n" +
                        "65727333001053367881220235421809751254540594752243\n" +
                        "52584907711670556013604839586446706324415722155397\n" +
                        "53697817977846174064955149290862569321978468622482\n" +
                        "83972241375657056057490261407972968652414535100474\n" +
                        "82166370484403199890008895243450658541227588666881\n" +
                        "16427171479924442928230863465674813919123162824586\n" +
                        "17866458359124566529476545682848912883142607690042\n" +
                        "24219022671055626321111109370544217506941658960408\n" +
                        "07198403850962455444362981230987879927244284909188\n" +
                        "84580156166097919133875499200524063689912560717606\n" +
                        "05886116467109405077541002256983155200055935729725\n" +
                        "71636269561882670428252483600823257530420752963450";

        int pos = 0;
        long fin = 0;
        
        //System.out.println(Integer.valueOf(num.charAt(1)) + 10);
        //int test = Character.getNumericValue(num.charAt(1));
        //System.out.println(test + 3);
        while (pos != 1007){
            int total = 1;
            System.out.println("Position: " + pos);
            for(int i = pos; i <= pos + 12;i++){
                int sumator = Math.abs(Character.getNumericValue(num.charAt(i)));
                total = total * sumator;
                System.out.println(total);
            }          
            //total = Math.abs(total);
            //System.out.println(total);
            if (total > fin){
                fin = total;
                 //System.out.println(fin);
            }
            pos++;
            
        }
        System.out.println(fin);

    }
    
    public static void EulerPitagoras9(){
        
        for(int i = 1;i<=333;i++){
            for (int j = i+1; j<=500 ;j++){
                for (int h = j +1;h<=1000;h++){
                    //System.out.println(i + " , " + j + " , " + h);
                    if((j + i + h) == 1000 && (i*i)+(j*j)==(h*h)){
                        System.out.println(i*j*h);
                        break;
                    }
                }
            }
        }
        
    }
    public static void EulerPrimeSum10(){
        
        long totalSum = 0;
        int num =2;
        //
        while(num <= 2000000){
            for(int i = 2; i<=num;i++){
               if(num == i){
                    totalSum = totalSum + num;
                    num= num + 1;                    
                    System.out.println(totalSum); 
                    break;
                }else if(num%i == 0){
                    num= num + 1;
                    break;
                }
        }      
        }
        System.out.println(totalSum);
    }
    
    public static void EulerTriangleNumbers12(){
        long TriangleNumber = 0;
        long posicion = 1;
        int divisor =0;
        while(divisor<500){
            divisor =0;
            TriangleNumber = TriangleNumber + posicion;
            posicion ++;
            for (int i = 1; i<= TriangleNumber;i++){
                if(TriangleNumber%i==0){
                divisor++;
                }
            }
           // System.out.println(divisor);
            //System.out.println(TriangleNumber);
        }
        System.out.println(TriangleNumber);

}
    
    public static void EulerCollazSequence14(){
        int num =500000;
        int fin = 1;
        int finnum;
        while(num <= 1000000){
            long numseq = num;
            int sequenc = 0;
            
            
            while(numseq != 1){
                if(numseq%2 == 0){
                    numseq = numseq / 2;
                }else{
                    numseq = (numseq * 3) + 1;
                }
                sequenc = sequenc + 1;  
                //System.out.println(numseq);
                 
            
            }
            if(sequenc > fin){
                fin = sequenc;
                finnum = num;
                
                System.out.println(finnum + "------" + fin);
            }   
            //System.out.println(num);
            num++;
        }
        System.out.println(fin);
    }
    
    public static void EulerPowerMil16(){
//        //long num =(long) Math.pow(2, 1000);
//        BigInteger num = new BigInteger ("1.0715086071862673E301");
//        //System.out.println(Math.pow(2, 1000));
//        System.out.println(num % 10);
//        //while(num)
    }
    public static void EulerFactorial20(){
        long total = 1;
         for(int i = 50; i>=1; i--){
              total = total * i;
              
         }
         System.out.println(total);
    }
}
