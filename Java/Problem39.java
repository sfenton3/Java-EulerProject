import java.util.*;
import java.util.Set;


public class Problem39 {

    public static void main(String[] args) {
        problem39();
        
    }

    public static void problem39() {
        int maxcount = 0;
        for (int i = 1; i < 1001; i++){
            int z = rt(i);
            if (z > maxcount){
                System.out.println(i);
                maxcount = z;
            }
                
        }
            
        
      
    }
    
    public static int rt(int n){
        double sqc = 0;
        double sumab = 0;
        int count = 0;
        
        for (int a = 1; a < n/2; a++){
            for (int b = 1; b < n/2; b++){
                sumab = Math.pow(a,2) + Math.pow(b, 2);
                sqc = Math.sqrt(sumab);
                if (sqc % 1 == 0 && a + b + sqc == n)
                    count++;
                        
            }
            
        }
    return count/2;   
    }
    }
    