
package powersof2;

/**
 *
 * @author Zachary Murphy
 */
public class PowersOf2 {

    public static void main(String[] args) {
        int e, result;
        for(int i =0; i <25; i++){
            result=1;
            e=i;
            while(e>0){
                result *=2;
                e--;
            }
            System.out.println("2 to the " + i + " power is " + result);
        }
    }
    
}
