import java.util.*;


public static void problem3(){//super sketchy cheap method of solving
        ArrayList all = new ArrayList();
        int i = 1;
        int[] primes = new int[20];
        long n = 600851475143L;
        while (i < n){
            if (n % i == 0 ){
                all.add(i);
                System.out.println(i);
            }
            if (all.toArray().length > 5){
                break;
            }
                
            i++;
        
    }
        System.out.println(all);
        
    }