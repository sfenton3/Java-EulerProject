import java.util.*;


public class Problem34 {

    public static void main(String[] args) {
        problem34();
        
    }

    public static void problem34() {
        String g = " ";       
        int sum = 0;
        int x = 0;
        
        
        for (int i = 3; i < 1000000000; i++){           
            g = String.valueOf(i); 
            sum = 0;
           
            for (int j = 0; j < g.length(); j++){
                int z = Character.getNumericValue(g.charAt(j)); 
                x = factorial(z);
                sum += x;
                
                
                
                
                }
            if (i == sum)
                System.out.println("num is: " + i + " the sum is: " + sum);
                                              
            }
        }
    
    
    public static int factorial(int z){
        int sum = 1;

        for (int m = 1; m <= z; m++){
            sum *= m;
        }
        return sum;
}
}


                
           

