
package casting;

/**
 *
 * @author Zachary Murphy
 */
public class Casting {


    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;
        
        x = 10.0;
        y = 3.0;
        
        i = (int) (x/y); //cast double to int
        System.out.println("Integer outcome of x/y:" + i);
        
        i =100;
        b = (byte) i; // no loss, byte can handle a value of 100.
        System.out.println("Value of b: " + b);
        
        i = 257;
        b = (byte) i; //information is lost because byte cannot handle 257 as value
        System.out.println("Value of b: " + b);
        
        b = 88; // ASCII code fo X
        ch = (char) b;
        System.out.println("ch: " + ch);
        
        
        
    }
    
}
