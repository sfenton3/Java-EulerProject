import java.util.*;
import java.math.BigInteger;

public class Problem25 {

    public static void main(String[] args) {
        problem25();
    }

    public static void problem25() {
        String[] fib = new String[100000000];
        fib[0] = "1";
        fib[1] = "1";
        BigInteger z = new BigInteger("0");
        
        
        for (int i = 0; i < 10000000; i++){ 
            if (i == 0)
                continue;
            if (i == 1)
                continue;
            z = (new BigInteger((fib[i-1])).add(new BigInteger((fib[(i-2)]))));            
            fib[i] = z.toString();
            if (z.toString().length() == 1000){
                System.out.println(i + 1);
                break;
            }
            
        }
        
            
        
    }
}
