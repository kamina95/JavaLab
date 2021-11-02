package lecture_2;

/**
 *
 * Exercises prepared basing on the book:
 * “Introduction to Java Programming and Data Structure”
 * Eleventh Edition by Y. Daniel Liang
 */
public class ConcatenationExample {
    public static void main(String[] args) {
        
        //definition of variable types of char and assigning values to them
        char yes = 'Y';
        char no = 'N';
        
        
        //printing out the values of the variables
        System.out.println(yes+ no); //167 =   89 is Y in UNICODE + 78 is N Unicode
        System.out.println(yes+ " means YES, "+ no+" means NO");
        
        //definition of variable types of String and assigning values to them
        String quote1 = "Just remember ";
        String quote2 = "you can\'t climb the ladder of success with your hands in your pockets";
        
        
        //printing values from the string to the console 
        System.out.println(quote1 +quote2);
        
        //lecture examples
        System.out.println("4"+"4");
        System.out.println("Hello"+" World");
        System.out.println("Middlesex"+ " University");
        System.out.println('a'+'b');
        

    }
    
}
