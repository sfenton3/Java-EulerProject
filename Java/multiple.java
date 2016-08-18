import java.util.*;
import java.math.BigInteger;

public class multiple {
    public static void main(String[] args){
       //problem1(); //to complicated
       //problem1improved(); //much simpler
       //problem2();
       //problem2improved(); //try to not use a data structure
       //problem3();
       //problem4();
       //problem5();
       //problem5improved();
       problem6();
        
    }
    public static void problem1(){
        LinkedList all = new LinkedList();
        Set uniqueall = new HashSet();
        int total = 0;
        for (int i = 0; i*3<1000; i++){
            all.add(i*3);
        }
        for (int i = 0; i*5<1000; i++){
            all.add(i*5);
        }
        uniqueall.addAll(all);
        Object[] sum = uniqueall.toArray();
        for (Object x : sum){
            total += (int) x;
        }
        System.out.println(total);
    }
    
    public static void problem1improved(){
        int sum = 0;
        for (int i = 0; i < 1000; i++)
            if (i%3 == 0 || i%5 == 0)
                sum += i;
        System.out.println(sum);
    }
    
    public static void problem2(){ // more complicated b/c of array list
        ArrayList all = new ArrayList();
        all.add(1); all.add(2);
        int sum = 0;       
               
        for (int i = 1, result = 0; result < 4000000; i++){
            result = (int)all.get(i) + (int)all.get(i-1);           
            all.add(result);
            if (result%2 == 0)
                sum += result;                                      
        }
        System.out.println(sum + 2);
    }
    
    public static void problem2improved(){ // much simpler b/c not need for exstangeous data structures
        int sum = 0;
        int x = 1;
        int y = 2;
        while (x < 4000000){
            if (x % 2 == 0)
                sum += x;
            int z = x + y;
            x = y; // w/ x and y defined and the next value being z, you always can switch to get former 2.
            y = z;
        }
        
    }
    
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
    
    public static void problem4(){ // pain in the ass string siwtching
        StringBuilder sb = new StringBuilder();
        ArrayList all = new ArrayList();
        int n = 0;
    
        for (int i = 1; i <= 999; i++){
            for(int j = 1; j <= 999; j++){
                int z = i * j;
                if (String.valueOf(z).equals(new StringBuilder(String.valueOf(z)).reverse().toString())){
                    if (z > n)
                        n = z;
                }
                }
            
    }
        System.out.println(n);
}
    public static void problem5(){ //super easy, lets simplify this one not quick n dirty
        // runs forever until break better off with while loop>?
        for (int i = 1; i != 0; i++){       
            if ((i%1 == 0) && (i%2 == 0)&& (i%3 == 0) && (i%4 == 0) && (i%5 == 0) && (i%6 == 0) && (i%7 == 0) && (i%8 == 0) && (i%9 == 0) && (i%10 == 0) &&
                    (i%11 == 0) && (i%12 == 0)&& (i%13 == 0) && (i%14 == 0) && (i%15 == 0) && (i%16 == 0) && (i%17 == 0) && (i%18 == 0) && (i%19 == 0) && (i%20 == 0)){
                System.out.println(i);
                break;
            }
    }
    }
    
    public static void problem5improved(){ //scraped for now!
        int i = 1;
        while(true){
            int sum = 0;
            for (int j = 1; j < 11; j++){
                if (i % j == 0)
                    sum += j;
            if (sum == 55){
                System.out.println(i);
                break;
            }
                
            }
            i++;
        }
    }
    
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
    
}

