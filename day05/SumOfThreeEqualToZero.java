package day05;

import java.util.*;

public class SumOfThreeEqualToZero {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] array=new int[size];
    for(int i=0;i<array.length;i++){
        array[i]=sc.nextInt();
    }
    Set<List<Integer>> set=new LinkedHashSet<>();
for(int i=0;i<array.length-2;i++){
   for(int j=i+1;j<array.length-1;j++){
    for(int k=j+1;k<array.length;k++){
        if(array[i]+array[j]+array[k]==0){
            List<Integer> list=new ArrayList<>();
            System.out.println(array[i]+" "+array[j] +" "+array[k]);
            list.add(array[i]);
            list.add(array[j]);
            list.add(array[k]);
            set.add(list);
        }
    }
   }
}
System.out.println("The Unique Triplets are : "+set.size());
   } 
}
