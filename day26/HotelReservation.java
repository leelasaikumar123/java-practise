import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class HotelReservation {
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program in javac HotelReservation class");
        ArrayList<Hotel> list = new ArrayList<>();
        // System.out.println("enter the hotel details");
        // boolean flag = true;
        Scanner sc = new Scanner(System.in);
        // while (flag) {
        // System.out.println("enter the name of the hotel");
        // String hotelname = sc.nextLine();
        // System.out.println("enter its rate per night");
        // float rate = sc.nextFloat();
        // sc.nextLine();
        // list.add(new Hotel(hotelname, rate));
        // System.out.println("if you still want to add another hotel press true or else
        // false");
        // flag = sc.nextBoolean();
        // sc.nextLine();
        // }
        list.add(new Hotel("LakeWood", 90, 110));
        list.add(new Hotel("BridgeWood", 50, 150));
        list.add(new Hotel("RidgeWood", 150, 220));
        System.out.println("enter checkin date");
        String checkIn = sc.nextLine();
        System.out.println("enter checkout date ");
        String checkOut = sc.nextLine();
        int checkInDay = Integer.parseInt(checkIn.substring(0, 2));
        int checkInMonth = findMonth(checkIn.substring(2, 5));
        int checkInYear = Integer.parseInt(checkIn.substring(5));

        int checkOutDay = Integer.parseInt(checkOut.substring(0, 2));
        int checkOutMonth = findMonth(checkOut.substring(2, 5));
        int checkOutYear = Integer.parseInt(checkOut.substring(5));
        LocalDate d1 = LocalDate.of(checkInYear, checkInMonth, checkInDay);
        LocalDate d2 = LocalDate.of(checkOutYear, checkOutMonth, checkOutDay);
        long days = ChronoUnit.DAYS.between(d1, d2);
        // Hotel hotel = cheapestHotelPrice(list).get();
        // System.out.println(hotel.getName() + ", Total Rates: $" + (days + 1) *
        // hotel.getRate());
        cheapestHotel(list, d1, d2);
    }

    public static int findMonth(String month) {

        switch (month) {

            case "Jan":
                return 1;

            case "Feb":
                return 2;

            case "Mar":
                return 3;

            case "Apr":
                return 4;

            case "May":
                return 5;

            case "Jun":
                return 6;

            case "Jul":
                return 7;

            case "Aug":
                return 8;

            case "Sep":
                return 9;

            case "Oct":
                return 10;

            case "Nov":
                return 11;

            case "Dec":
                return 12;

            default:
                return -1;
        }
    }

    // public static Optional<Hotel> cheapestHotelPrice(ArrayList<Hotel> list) {
    // Optional<Hotel> opt = list.stream().min((a, b) -> Float.compare(a.getRate(),
    // b.getRate()));
    // return opt;
    // }

    public static void cheapestHotel(ArrayList<Hotel> list, LocalDate d1, LocalDate d2) {

        float min = Float.MAX_VALUE;
        String cheapestHotel = "";

        for (Hotel hotel : list) {

            float total = 0;

            LocalDate temp = d1;

            while (!temp.isAfter(d2)) {

                if (temp.getDayOfWeek().getValue() >= 6) {

                    total += hotel.getWeekendRate();

                } else {

                    total += hotel.getWeekdayRate();
                }

                temp = temp.plusDays(1);
            }

          

            if (total < min) {
                cheapestHotel = hotel.getName();
                min = total;
            }
        }
        System.out.println("Cheapest Hotel: " + cheapestHotel + " Total Rates: $" + min);
    }

}

class Hotel {
    private String name;
    private float weekendRate;
    private float weekdayRate;

    public Hotel(String name, float weekendRate, float weekdayRate) {
        this.name = name;
        this.weekendRate = weekendRate;
        this.weekdayRate = weekdayRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeekendRate() {
        return weekendRate;
    }

    public void setWeekendRate(float weekendRate) {
        this.weekendRate = weekendRate;
    }

    public float getWeekdayRate() {
        return weekdayRate;
    }

    public void setWeekdayRate(float weekdayRate) {
        this.weekdayRate = weekdayRate;
    }

}
