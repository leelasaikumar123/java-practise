package src.day24;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPI{
    public static void main(String[] args) {
       List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       list.stream().forEach(System.out::println); 
    List<Double> list2=list.stream().map(n->n*1.0).collect(Collectors.toList()); 
    list2.forEach(System.out::println);
    list.stream().filter(n->n%2==0).forEach(System.out::println);
    System.out.println("First even number in the stream");
      Optional<Integer> opt=list.stream().filter(n->n%2==0).findFirst();
    System.out.println(opt.get());
    Optional<Integer> min=list.stream().min((a,b)->a.compareTo(b));
  System.out.println("The min value in the stream is "+min.get());
  Optional<Integer> max=list.stream().max((a,b)->a.compareTo(b));
  System.out.println("The max value in the stream is "+max.get());
  Optional<Integer> sum=list.stream().reduce((a,b)->a+b);
  long size=list.stream().count();
  System.out.println("The sum of stream is "+sum.get());
  System.out.println("The avg of stream is "+sum.get()/size);
  list.sorted().forEach(system.out::println);
      }
}