import java.util.*;


public class Problem30 {

    public static void main(String[] args) {
        problem30();
        
    }

    public static void problem30() {
        String g = " ";
        int x = 0;
        int five = 0;
        for (int i = 10; i < 1000000; i++){            
            g = String.valueOf(i);
            x = 0;
            
            for (int j = 0; j < g.length(); j++){
                x += Math.pow(Character.getNumericValue(g.charAt(j)), 5); 
                                              
            }
            if (x == Integer.valueOf(g)){
                System.out.println(x);
                five += x;
            }
        }
        System.out.println(five);
    }
}
