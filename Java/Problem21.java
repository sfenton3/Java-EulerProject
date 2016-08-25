import java.util.*;
import java.util.Set;


public class Problem21 {

    public static void main(String[] args) {
        problem21(); //abstracting divsum out makes things easier
        
    }

    public static void problem21() {
        int sum = 0;
        
        for (int i = 2; i < 10000; i++){
            int x = divsum(i);
            int y = divsum(x);
            if (i == y && x != y)
                sum += x;
        
       
        }
        System.out.println(sum);
        
    }
    
    public static int divsum(int n){
        int sum = 0;
    
        for (int i = 1; i < n; i++){
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }
}
        