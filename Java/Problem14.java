import java.util.ArrayList;

public class Problem14 {
    

    public static void main(String[] args) {
        problem14();
    }
    
    public static void problem14(){
        int count = 1;
        int maxcount = 0;
        
        for (int i = 1; i < 1000000; i++){
            if (count > maxcount){
                maxcount = count;
                System.out.println(i-1 + " " + maxcount);
            }
            count = 1;
            long n = i;
            while (n != 1){
                if (n % 2 == 0){
                    n = n /2;
                    count++;}
                else{
                    n = n*3 + 1;
                    count++;}
        }
        
    }
    }
    
}
