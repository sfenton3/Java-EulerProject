import java.util.*;

public class Problem9 {

    public static void main(String[] args) {
        problem9();
    }

    public static void problem9() {
        for (int i = 1; i < 1000; i++){                    
            for (int j = 1; j < 1000; j++){
                for (int m = 1; m < 1000; m++){
                    if ((i*i + j*j == m*m) && (i+j+m == 1000) ){
                        System.out.println(i*j*m);
                        break;
                    }
                    
                }
            }
        }
        
        

            
            

}
}
