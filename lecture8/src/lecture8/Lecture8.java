package lecture8;
import java.util.Scanner;
/**
 *
 * @author anton
 */
public class Lecture8 {

    public static void main(String[] args) {
        
        //Exercise 7.1
        //grades();
        
        //Exercise 7.3
        //RepOcurrences();
        
        //Exercise 7.5
        //EvenOdd();
        
        //Exercise 7.9;
        //Randome200();
        
        //Exercise 7.9
        //ArrayCreator();
        
        //Exercise 7.11
        //deviationMean();
        
        //Exercise 7.13
        //int[] myArray ={1,2,3,4,5,6};
        //System.out.println(getRandom(myArray));
        
        //Exercise 7.15   wrooong
        
        //Exercise 7.18
        //bubbleSort();
        
        //Exercise 7.19
        int []n={1,2,3,4,5,6,7,8};
        int []n2={1,2,7,4,5,10,7,8};
        isSorted(n);
        isSorted(n2);
        
    }
    
    
    //Exercise 7.1
    public static void grades(){
        Scanner input = new Scanner(System.in);
        int posi = 0;
        
        System.out.println("introduce a number of students");
        int wei = input.nextInt();
        int max=0;
        
        int [] notasArray = new int [wei];
        System.out.println("Introduce " + wei + " scores");


        for(int i = 0; i < wei; i++)
        {           
            notasArray [i] = input.nextInt();
            
            if(notasArray [i]>max){
                max =notasArray[i];
            }
        }

        for (int l=0; l<wei ;l++){
            String mark;
            if(notasArray[l]== max)
                mark = "A";
            else if(notasArray[l]>= max -5){
                mark = "A";
            }
            else if(notasArray[l]>= max -10){
                mark = "B";
            }
            else if(notasArray[l]>= max -15){
                mark = "C";
            }
            else if(notasArray[l]>= max - 20){
                mark = "D";
            }else{
                mark = "F";
            }
            
                System.out.println("Student " + l + " score is " + notasArray[l] + " and a grade is " + mark);
        }      
        
    }
    
    
   //Exercise 7.3
    
    public static void RepOcurrences(){
        int [] counterArray = new int [50];
        Scanner input = new Scanner(System.in);
        while(true){
            int sumator = input.nextInt();
            if(sumator == 0) break;
            counterArray [sumator] = counterArray [sumator] + 1;    
        }
        for (int e=0; e<=50; e++){
            if(counterArray [e] == 1){
                System.out.println(e + " occurs 1 time");          
            }if(counterArray [e] > 1){
                System.out.println(e + " occurs " + counterArray[e] + " time");                        
            }
            
        }
        
    }
    
    //Exercise 7.5
    public static void EvenOdd(){
    
        Scanner input = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        System.out.println("introduce numbers, the 0 it will finish the count");
        while(true){
            int number = input.nextInt();
            if(number == 0){
                break;
            }
            if(number%2==0){
                even++;
            }else{
                odd++;
            }
            
        }
        System.out.println("The number of odd numbers: " + odd);
        System.out.println("The number of even numbers: " + even);
        
        
    }
    
    public static void Randome200(){
        
        int [] counterArray = new int [10];
        
        
        for(int i=0;i<100;i++){
        int min=0, max=9;   
        int rand = (int)(Math.random()*((max-min)+1))+min;
            
        counterArray[rand]= counterArray[rand] +1;
        }
        for(int e: counterArray){
            System.out.print(e + " ");
        }
        
        
        
    }
    
    public static void ArrayCreator(){
        Scanner input = new Scanner(System.in);
        double [] array = new double[10];
        
        System.out.println("Introduce 10 numbers");
        for(int i =0; i<10;i++){
            array[i] = input.nextDouble();
        }
       
        System.out.println(max(array));
    
    }
    public static double max(double[] array){
        double maxNum =0;
        for(int i = 0;i<10;i++){
           if(array[i] > maxNum){
               maxNum = array[i];
           }
        }
        return maxNum;
    }
    
    
        public static double[] ArrayCreator2(){
        Scanner input = new Scanner(System.in);
        double [] array = new double[10];
        
        System.out.println("Introduce 10 numbers");
        for(int i =0; i<10;i++){
            array[i] = input.nextDouble();
        }
       
        return array;
    
    }
    
    public static void deviationMean(){
        double[] arrayNum = ArrayCreator2();
        double total=0;   
         
        
//        for(int i=0; int <10; i++){
//            total = total + arrayNum[i];       
//        }
    
    }
    
    //Exercise 7.13
    public static int getRandom(int []numbers){
        int size = numbers.length;
        
        int min=0, max=size;   
        int rand = (int)(Math.random()*((max-min)+1))+min;
        return numbers[rand];
        
    }
    
    
    //Exercise 7.15
//     public static int[] eliminateDuplicates(int[] list){
//         for(int i =0;i<10; i++){
//             for(int j =i;j<10;j++){
//                if(list[i]==list[j]){
//                    
//                }
//             }
//         }
//         
//     }
//

//    public static void sortStudnets(){
//        Scanner input = new Scanner(System.in);
//        while(true){
//            try {
//                
//                
//                
//            }catch(Exception e){
//                break;
//            }
//        }
//    
//    
//    }
    
    
    
    //Exercise 7.18d
    public static void swapArray(int[] array, int n1, int n2){
        int temp = array[n1];
        array [n1] = array[n2];
        array[n2] = temp;
    }
    
    public static void bubbleSort(){
        int []arr = {5,1,2,7,15,1,4,9,5};
        for(int i = arr.length;i>=0;i--){
            for(int j =0; j<i-1;j++){
                if(arr[j]>arr[j+1]){
                   
                    swapArray(arr,j,j+1);
                }
            }
        }
        for (int e: arr){
            System.out.print(e + " ");
        }
        
    }
    
    //EExercise 7.19
    
    public static boolean isSorted(int[] list){
       for(int i =0; i< list.length - 1;i++){
           if(list[i]>list[i+1]){
               System.out.println("The list is not sorted");              
               return false;
           }
       
       }
       System.out.println("The list is already sorted");
       return true;
    }

    
}
