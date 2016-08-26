import java.util.*;
import java.util.Set;


public class Problem44 {

    public static void main(String[] args) {
        problem44(); //37 seconds
        
    }

    public static void problem44() {
        int w = 3000;
        for (int i = 1; i < w; i++){
            int z = penta(i);
            for (int j = 1; j < w; j++){
                int y = penta(j);
                for (int k = 1; k < w; k++){
                    int l = penta(k);
                    if (z + y == l){
                        for (int g = 1; g < w; g++){
                            if (Math.abs(z - y) == penta(g)){
                                System.out.println(Math.abs(y - z));
                                break;
                            }
                        }
                    
                    }
                    }
            }
            
        }
    }
    
    
    
    
    
    public static int penta(int n){
        int p = n*(3*n-1)/2;
        return p;
    }
    
    public static int pentalop(int n){
        for (int i = 1; i < n; i++){
            int p = n*(3*n-1)/2;
            return p;
        }
        return 1;
    }
}