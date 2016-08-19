import java.util.*;

public class Problem12 {

    public static void main(String[] args) {
        problem12(); //17 min ansd 40 seconds...what a bad solution
    }

    public static void problem12() {
        String result = "";
        int divisors = 0;
        int current = 0;
        int maxdiv = 0;
        
        for (int i =1; divisors < 7000; i++){
            if (divisors > maxdiv){
                maxdiv = divisors;
                System.out.println(current + " with " + divisors);
                
            }
            current += i;
            divisors = 0;
            if (current % 2 != 0)
                continue;
            for (int m = 1; m <= current; m++){
                if (current % m == 0){                                   
                    divisors++;}
                
            }

        }
        
        
        
        
        
        
        
        
        
    }
}
