package day03;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElements {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
    LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
    for(int num:array){
        if(map.containsKey(num)){
            map.put(num,map.get(num)+1);
        }
        else{
            map.put(num,1);
        }
    }
    Set<Integer> set=map.keySet();
    for(int num:set){
        if(map.get(num)>1){
        System.out.print(num+" ");
        }
    }
    }
}
