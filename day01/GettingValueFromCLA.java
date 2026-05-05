package day01;

public class GettingValueFromCLA {
    public static void main(String[] args) {
        String name="";
        for(int i=0;i<args.length;i++){
            name=name+" "+args[i];
        }
        System.out.println("My Name is" +name);
    }
}
