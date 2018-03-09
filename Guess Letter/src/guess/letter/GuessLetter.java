
package guess.letter;
//import to use a  scanner object  
import java.util.Scanner;
/**
 *
 * @author Zachary Murphy
 */
public class GuessLetter {
    
    public static void main(String[] args) {
        //var decs 
        char ch, answer = 'K';
        Scanner reader = new Scanner (System.in);
        
        //intro
        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.println("Answer must be upper case...");
        System.out.println("Can you guess it??");
        
        //get input from user
        ch = reader.next().charAt(0);
        
        // outputs
        if (ch == answer){
            System.out.println("**WAY TO GO!");
        } else{
            System.out.println("Sorry, wrong!");
            //nested if
            if (ch < answer){
                System.out.println("Too low of a letter.");
            } else {
                System.out.println(" Too high of a letter.");
            }
         }
    }
}
