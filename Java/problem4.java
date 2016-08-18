import java.util.*;

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