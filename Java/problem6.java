java.util.*;

public static void problem6(){
        int x = problem6sum(100);
        int y = problem6square(100);
        int z = y - x;
        System.out.println(z);
        
    }
    public static int problem6sum(int x){
        int i = 1;
        int sum = 0;
        while (i < 101){
            sum += i*i;
            i++;
            
        }
        System.out.println(sum);
        return sum;
        
    }
    
    public static int problem6square(int x){
        int i = 1;
        int sum = 0;
        while (i < 101){
            sum += i;
            i++;
        }
        System.out.println(sum*sum);
        return (sum*sum);

            
    }
    