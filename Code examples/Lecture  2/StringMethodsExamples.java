package lecture_2;

/**
 *
 * Exercises prepared basing on the book:
 * “Introduction to Java Programming and Data Structure”
 * Eleventh Edition by Y. Daniel Liang
 */
public class StringMethodsExamples {
    public static void main(String[] args) {
        String title = " Introduction to Java Programming ";
        
        System.out.println("The numbers of characters in the title: "+title+" is: "+ title.length());
        System.out.println("The first letter in the title: "+title+" is: "+ title.charAt(0));
        System.out.println("The author of Java book : "+ title.concat(" is:  Y. Liang "));
        System.out.println("The title is: "+ title.toUpperCase());
        System.out.println("The title is: "+ title.toLowerCase());
        System.out.println("The title trimmed is: "+title.trim());
        
        
    }
    
}
