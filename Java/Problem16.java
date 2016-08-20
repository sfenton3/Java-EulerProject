import java.util.ArrayList;
import java.math.BigInteger;

public class Problem16 {
    

    public static void main(String[] args) {
        problem8();// less than a second
    }
    
    public static void problem16(){   
        BigInteger sum = new BigInteger("1");
        BigInteger power = new BigInteger("2");
        String sumpower = "";
        int z = 0;
        
        
        for (int i = 1; i < 1001; i++){
            sum = sum.multiply(power);
            if (i == 1000)
                sumpower = sum.toString();                               
    }
       String[] add = sumpower.split("");
       for (String x : add)
           z += Integer.valueOf(x);
       System.out.println(z);
           
        
        
        
    }
}
