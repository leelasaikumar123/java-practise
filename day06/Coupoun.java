package day06;

import java.util.*;

public class Coupoun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int noCoupons=sc.nextInt();
        Set<Integer> set=new LinkedHashSet<>();
        int noOfTurns=0;
        while(noCoupons != set.size()){
        int randNo=random.nextInt(noCoupons)+1;
        if(!set.contains(randNo))
{
    set.add(randNo);
}
            noOfTurns++;
        }
        System.out.println(noOfTurns);
    }
}
