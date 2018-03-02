
package shortcircuit;

/**
 *
 * @author Zachary Murphy
 */
public class ShortCircuit {

    public static void main(String[] args) {
        int n, d, q;
        n =10;
        d = 2;
        if(d != 0 && (n %d) == 0){
            System.out.println(d +" is a factor of " + n);
        }
        d = 0; //now ,d is to 0.
        
        //since d is zero the second operand is not evaluted.
        if (d != 0 && (n % d) == 0){
            System.out.println(d + "is a factor of " +n);
            
        }
        
        //now without a short circuit operator.
        //this will cause a divide by zero error
        if (d != 0 & (n%d) ==0){
            System.out.println(d + " is a factor of " +n);
        }
    }
    
}
