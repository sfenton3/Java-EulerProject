import java.util.ArrayList;

public class Problem10 {
    
    public static int mil = 2000002;

    public static void main(String[] args) {
        problem10();//copyed some from stackoverflow...
    }
    
    public static void problem10(){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        boolean[] nonprime = new boolean[mil];
        long sum = 0;
        int count = 0;
        
        for (int i = 2; i < mil; i++){
            if (!nonprime[i]){
                primes.add(i);
                count++;}
            int x = 2;
            while (i * x < mil){
                nonprime[i*x] = true;
                x++;
            }
        }
        for (int x : primes){
            sum += x;
        }
        System.out.println(sum);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
