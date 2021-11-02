package lecture_2;

/**
 *
 * Exercises prepared basing on the book:
 * “Introduction to Java Programming and Data Structure”
 * Eleventh Edition by Y. Daniel Liang
 */
public class CharMethodsExamples {
    public static void main(String[] args) {
        
        //deceleration of three variables types of char and 
        char sizeS = 'S', sizeM = 'M', sizeL = 'L';
        
        
        System.out.println("It is: "+Character.isDigit(sizeS)  + " taht size in ZARA is provide as a number ");
        System.out.println("It is: "+Character.isLetter(sizeS)  + " taht size in ZARA is provide as a letter ");
        System.out.println("Lets print all the sizes in small letter: "+Character.toLowerCase(sizeS)+" "+Character.toLowerCase(sizeM)+" "+ Character.toLowerCase(sizeL));
        
    }
    
}
