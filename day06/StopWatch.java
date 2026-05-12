package day06;
import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the start time in hr:min:sec");{
        String startTime=sc.next();
        System.out.println("enter the endtime time in hr:min:sec");
        String endTime=sc.next();
        String[] startTimeArray=startTime.split(":");
        String[] endTimeArray=endTime.split(":");
      int startTimeInSeconds=Integer.parseInt(startTimeArray[0])*3600+Integer.parseInt(startTimeArray[1])*60+Integer.parseInt(startTimeArray[2]);
      int endTimeInSeconds=Integer.parseInt(endTimeArray[0])*3600+Integer.parseInt(endTimeArray[1])*60+Integer.parseInt(endTimeArray[2]);
      int diffInSeconds=endTimeInSeconds-startTimeInSeconds;
      System.out.println((diffInSeconds)/3600 +" hrs "+(diffInSeconds%3600)/60+" mins " +diffInSeconds%60 +" seconds");
       }
    }
}
