import java.util.*;
import java.util.Set;


public class Problem29 {

    public static void main(String[] args) {
        problem29();//less than 1 second
        
    }

    public static void problem29() {
        double sum = 0;
        int count = 0;
        HashSet<Double> nums = new HashSet<>(); //this is an distinct unordered list of things
        
    
                
        for (int a = 2; a <= 100; a++){ //double for loop, to loop through every possibility...
            for (int b = 2; b <= 100; b++){
                sum = 0;
                sum = Math.pow(a, b);
                nums.add(sum);
            }
            
        }
        for (double n : nums)//to count how many values are in the set
            count++;
        System.out.println(count);
    }
}
        