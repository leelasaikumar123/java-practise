package day16day17.RunTimeAnalisis;

import java.util.Random;

public class StringConcatination {
    public static void main(String[] args) {
        int[] size={1000,10000,100000};
        for(int i=0;i<size.length;i++){
       System.out.println("The run time for the size "+size[i]);
        
    long stringStartTime=System.nanoTime();
    StringConcatinationRuntimeAnalais.timeComplexityForString(size[i]);
    long stringEndTime=System.nanoTime();
 
        long stringBuilderStartTime=System.nanoTime();
    StringConcatinationRuntimeAnalais.timeComplexityForStringBuilder(size[i]);
    long stringBuilderEndTime=System.nanoTime();

   
            long stringBufferStartTime=System.nanoTime();
    StringConcatinationRuntimeAnalais.timeComplexityForStringBuffer(size[i]);
    long stringBufferEndTime=System.nanoTime();
        
       
        System.out.println("The Run Time For String is "+(stringEndTime-stringStartTime)/1000000);
         System.out.println("The Run Time For StringBuilder is "+(stringBuilderEndTime-stringBuilderStartTime)/1000000);
          System.out.println("The Run Time For StringBuffer is "+(stringBufferEndTime-stringBufferStartTime)/1000000);
          }  }
}
   class StringConcatinationRuntimeAnalais{
    static Random random=new Random();
    static String sentence="abcdefghijklmnpqrstuvwxyz1234567890";
    public static void timeComplexityForString(int size){
        String res="";
        for(int i=0;i<size;i++){
            int num=random.nextInt(sentence.length());
            res=res+sentence.substring(num);
        }
    }
    public static void timeComplexityForStringBuilder(int size){
        StringBuilder builder=new StringBuilder();
               for(int i=0;i<size;i++){
            int num=random.nextInt(sentence.length());
           builder.append(sentence.substring(num));
        }
    }
    public static void timeComplexityForStringBuffer(int size){
        StringBuffer buffer=new StringBuffer();
               for(int i=0;i<size;i++){
            int num=random.nextInt(sentence.length());
           buffer.append(sentence.substring(num));
        }
    }
   } 
