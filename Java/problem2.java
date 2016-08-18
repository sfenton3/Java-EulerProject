import java.util.*;

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