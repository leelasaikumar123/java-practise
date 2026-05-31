package src.day24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI{
    public static void main(String[] args) {
       List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       list.stream().forEach(System.out::println); 
    List<Double> list2=list.stream().map(n->n*1.0).collect(Collectors.toList()); 
    list2.forEach(System.out::println);
    }
}