
package java_help_sys;

//for scanner object
import java.util.Scanner;

/**
 *
 * @author Zachary Murphy
 */
public class Java_Help_Sys {

    public static void main(String[] args) {
        //var declarations
        int choice;
        Scanner read= new Scanner (System.in);
        
        //intro to user
        System.out.println("Help on:");
        System.out.println("    1. if");
        System.out.println("    2. switch");
        System.out.println(" Choose one: ");
        
        //get input from user.
        choice = read.nextInt();
        
        System.out.println("\n");
        
        //outputs per user input
        switch (choice){
            case 1:
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case 2:
                System.out.println("The swtich:\n");
                System.out.println("swtich(expression)   {");
                System.out.println("    case constant: ");
                System.out.println("        statement sequence");
                System.out.println("       break;");
                System.out.println("    //...");
                System.out.println("]");
            break;
            default:
                System.out.println("Selection not found...");
    }
        
    }
    }
    

