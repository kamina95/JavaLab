
package lecture7;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author anton
 */
public class Lecture7 {


    public static void main(String[] args) {
   
        //exercise 6.1
        //printPentagono(100); 
        
        //Exercise 6.2
        //System.out.println(sumDigits(123));
        
        //eXERCISE 6.3
        //System.out.println(reverse(123523));
        //System.out.println(isPalindrome(12));
        //System.out.println(isPalindrome(121));
        
        //Exercise 6.4
        //reverse1(6371);
        
        //Exercise 6.5
        //displaySortedNumbers(32,123,100);
        
        //Exercise 6.16
        //numberOfDaysInAYear(20);
        
        //Exercise 6.17
        //printMatrix(12);
        
        //Exercise 6.18
        //PasswordChecker("ff444ffffff");
        
        //Exercise 6.20
        //System.out.println(countLetters("Hola34 pepe"));
        
        //Exercise 2.23
        //System.out.println(count("Holilooopo", 'o'));
        
        //Exercise 6.25
        //System.out.println(convertMillis(555550000));
        
        //Exercise 6.27
        //emirp();
        
        //Exercise 6.31
        //long credit1 = 4388576018402626L;
        //long credit2 =4388576018410707L;
        //System.out.println(idValid(credit1));
        //System.out.println(idValid(credit2));
        
        //Exercise 6.33
        //displayTime();
        
    }
    
    
    
    
   
    //Exercise 6.1
    public static int getPentagonalNumber(int n){       
        int j = (n * (3 * n -1))/2;       
        return j;
              
    }
 
    public static void printPentagono(int numberOfPentagono){
        int count = 0;
        final int NumberInLine = 10;
        while(count != numberOfPentagono){
            count++;
            if (count % NumberInLine == 0){
                System.out.printf("%7d\n", getPentagonalNumber(count));
            }else{
                System.out.printf("%7d", getPentagonalNumber(count));
            }
        }
    
    }
      
    
    public static void checker (String pass){
        Scanner input = new Scanner(System.in);
        String truepass = "12hola";
        while(true){
        if(truepass.equals(pass)){ 
            System.out.println("Correct");
            break;
        }else{
            
            System.out.println("Give a correct password");
            String password = input.next();
        }
        }
       
    }
    
    //Exercise 6.2
    public static int sumDigits(long n){
        int result = 0;
        while(n!=0){
            
            result = (int) (result + (n%10));
            n = n/10;          
        }

       return result;
    }
    
    
    //Exercise 6.3
    public static int reverse(int number){
        int numberToPass = number % 10;
        int result = numberToPass;
        number = number /10;
          while(number!=0){
            numberToPass = number % 10;
            result = result * 10 + numberToPass;           
            number = number/10;          
        }
        
        return result;
    
    }
    public static boolean isPalindrome(int number){
        return number == reverse(number);
        
    }
    
    //Exercise 6.4
    public static void reverse1(int number){
        int numberToPass = number % 10;
        int result = numberToPass;
        number = number /10;
          while(number!=0){
            numberToPass = number % 10;
            result = result * 10 + numberToPass;           
            number = number/10;          
    }
        System.out.println(result);
    }
      
    public static void displaySortedNumbers(double num1,double num2, double num3){


        if(num1<num2){
            double a = num2;
            num2 = num1;
            num1 = a;
        }if(num2<num3){
            double a = num3;
            num3 = num2;
            num2 = a;
        } if(num1<num2){
            double a = num2;
            num2 = num1;
            num1 = a;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
          
    }
    
    //Exercise 6.16
    public static int numberOfDaysInAYear(int year){
        int result = year * 365;
        return result;
    }
    
    //Exercise 6.17
    public static void printMatrix(int n){
        
        int min = 0;
        int max = 1;
        
        
        int count = 0;
        final int NumberInLine = n;
        while(count != (n * n)){
            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            count++;
            if (count % NumberInLine == 0){
                System.out.printf("%4d\n", random_int);
            }else{
                System.out.printf("%4d", random_int);
            }
        }       
    }
            
    public static void PasswordChecker(String pass){
        int count=0;
        for(int i=0;i<pass.length();i++)
        {
            if(Character.isDigit(pass.charAt(i)))
            count++;
    
        }
        if(pass.length()>=10&&count>=3){
            System.out.println("proper password");
        }else{
            System.out.println("noooo proper password");
        
        }
    
    }    
    
    //Exercise 6.20
    public static int countLetters(String s){
        int result = 0;
        
        for(int i=0; i < s.length(); i++) {
            Boolean flag = Character.isLetter(s.charAt(i));
        
            if(flag){
                result++;
            }       
        }
        return result;
    }
    
    //Exercise 6.23
    public static int count(String str, char a){
    int result = 0;
    for(int i =0; i < str.length(); i++){
        if(str.charAt(i) ==  a){
            result++;
        }
    }
    
    return result;
    }
    
    public static String convertMillis(long millis){
        String horaTotal;
        int segundos;
        int minutos;
        int horas;
        
        horas = (int) (millis / 360000);
        minutos = (int) (millis % 360000) / 6000;
        segundos = (int) ((millis % 360000) % 6000) /1000 ;
    
        horaTotal = horas + ":" + minutos + ":" + segundos;
        return horaTotal;
    }
    
    
    
    //Exercise 6.27
    public static void emirp(){
        int count =1;   
        int n = 2;
        while(count != 121){
            if(prime(n)&&prime(rever(n))){
                colocador(n,count);
                n++;
                count++;
            }else{
                n++;
            }
        
        
        }       
    }
    
    public static boolean prime(int n){ 
        boolean res=false;        
        for(int i = 2; i<=n;i++){
            if(i == n){
                res = true;
                break;
            }
            if(n%i==0){
                n++;
                break;
            } 
                                                     
        }  
        
        return res;
    }
    
    public static void colocador(int n, int count){
        final int NumberInLine = 10; 
        if (count % NumberInLine == 0){
            System.out.printf("%5d\n", n);
        }else{
            System.out.printf("%5d", n);
        }
        
    }
    
    public static int rever(int n){
        int result = n%10;
        n = n/10;
        while(n!=0){
            result = (result * 10) + (n%10);
            n = n/10;
        
        }
        return result;
    }
    
    
    //Exercise 6.31
    public static boolean idValid(long number){
        boolean valid = false;
       
        if((sumOfDoubleEvenPlace(number)+ sumOfOddPlace(number))%10 ==0){
            valid = true;
        }
    
        return valid;
    }
    
    public static int sumOfDoubleEvenPlace(long number){
        int result = 0;
        int n;
        number = number/10;
        int forSum = (int)number%10;
               
        
        while(number/10 != 0){
            result = result + (getDigit(forSum));
            number = number / 100;
            forSum = (int)number%10;
        }
        return result;
        
    }
    
    public static int getDigit(int number){
        if(number<=4){
            number = number *2;
            return number;
        }else{
            number = number *2;
            number = (number/10) + (number%10);
            return number;
        }
    }
    
    public static int sumOfOddPlace(long number){
        
        int result = 0;
        int n;
        int forSum = (int)number%10;        
        number = number/100;
                
        while(number/10 != 0){
            result = result + forSum;
            number = number / 100;
            forSum = (int)number%10;
        }
        return result;
    }
    
    public static void displayTime(){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
    }
     
    
    
}
