import java.util.*;

public class Problem10 {

    public static void main(String[] args) {
        problem10();
    }

    public static void problem10() {
        int i = 2;
        int sum = 0;
        int count = 0;
               
        while (i < 50000){
            if (count == 1)
                sum += i-1;
            count = 0;
            for (int j = 2; j <= i; j++){
                if (i % j == 0)
                    count++;
            }
            i++;
        }
        System.out.println(sum);

}
}
