import java.util.*;

public class HotelReservation {
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program in javac HotelReservation class");
        ArrayList<Hotel> list=new ArrayList<>();
        System.out.println("enter the hotel details");
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        while(flag){
            System.out.println("enter the name of the hotel");
            String hotelname=sc.nextLine();
            System.out.println("enter its rate per night");
            float rate=sc.nextFloat();
            sc.nextLine();
            list.add(new Hotel(hotelname, rate));
            System.out.println("if you still want to add another hotel press true or else false");
            flag=sc.nextBoolean();
            sc.nextLine();
        }
    }
}
class Hotel{
    private String name;
    private float rate;
    public Hotel(String name, float rate) {
        this.name = name;
        this.rate = rate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getRate() {
        return rate;
    }
    public void setRate(float rate) {
        this.rate = rate;
    }
    public String toString(){
  return "name :"+name+" price: "+rate;
    }
}
