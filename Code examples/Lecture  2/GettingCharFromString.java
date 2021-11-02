package lecture_2;

/**
 *
 * Exercises prepared basing on the book:
 * “Introduction to Java Programming and Data Structure”
 * Eleventh Edition by Y. Daniel Liang
 */
public class GettingCharFromString {
    public static void main(String[] args) {
        String welcome = "Welcome to Java";
        
        System.out.println("The string length is: "+ welcome.length());
        System.out.println("First letter from the  String is: "+welcome.charAt(0));
        
        
        // In this example I passed as a parameter welecome.length() in order to get the last letter
        // but the welcome.length() method returns nimber 15 in this case
        //the error would be: Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 15 becose at position 15 there is not a character any longer
        System.out.println("The last letter in the string is: "+ welcome.charAt(welcome.length()));
        
    }
    
}
