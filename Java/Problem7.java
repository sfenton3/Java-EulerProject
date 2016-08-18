
public class Problem7 {
    
    public static void main(String[] args) {
        System.out.println(problem7(10001)); //takes 25 seconds to run...could be much quicker
    }

    public static int problem7(int finVal) {
        for (int i = 2, count = 0, countprime = 0; i != 0; i++) {
            if (count == 1)
                countprime++;            
            if (countprime == finVal){
                return i-1;    
            }
            count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0)
                    count++;
                }
            
                
            }
        return 10;
        }

    }


}
