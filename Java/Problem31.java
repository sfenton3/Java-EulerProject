import java.util.*;

public class Problem31 {

    public static void main(String[] args) {
        problem31(); //28 seconds 8 loops omg
    }

    public static void problem31() {
        int count = 0;
        int total = 200;
        int sum = 0;
        
        for (int i = 0; i < 2; i++){
            for (int a = 0; a < 3; a++){
                for (int b = 0; b < 5; b++){
                    for (int c = 0; c < 11; c++){
                        for (int d = 0; d < 21; d++){
                            for (int e = 0; e < 41; e++){
                                for (int f = 0; f < 101; f++){
                                    for (int g = 0; g < 201; g++){
                                        sum = i*200 + a*100 + b*50 + c*20 + d*10 + e*5 + f*2 + g*1;
                                        if (sum != total){
                                            sum = 0;
                                            continue;
                                        }
                                        else 
                                            System.out.println(sum + " " + i + " " + a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g);
                                            sum = 0;
                                            count++;
                                            
                                    }

                                }

                            }

                        }

                    }

                }

            }

        }
        System.out.println(count);
        
    }
}
