import java.util.*;


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