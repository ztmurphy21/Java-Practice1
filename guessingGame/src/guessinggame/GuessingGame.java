
package guessinggame;

import java.io.IOException;



/**
 *
 * @author Zachary Murphy
 */
public class GuessingGame {

    public static void main(String[] args) throws IOException {
       
        char ch, ignore, answer = 'K';
        
        do{
            System.out.println("I am thinking of a letter between A and Z....");
            System.out.println("Can you guess it??");
            
            //read a char
            ch = (char) System.in.read();
            
            //discard any othe rhcaracters in the input buffer
            do{
                ignore = (char) System.in.read();
                
            } while (ignore != '\n');
            
            if(ch==answer) System.out.println("Correct!!");
            else{
                System.out.println("Sorry...");
                if(ch<answer) System.out.println("too low of letter....");
                else System.out.println("too high of letter....");
                System.out.println("Try again!");
            }
            
        } while (answer != ch);
    }
    
}
