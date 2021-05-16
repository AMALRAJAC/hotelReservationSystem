import java.time.LocalDate;

public class ReservationSystem {
    private static LocalDate date1;
    private static String hotelName;
    private static LocalDate date2;
    private static LocalDate date3;
    private static String costomer_type;
    public void reservationSystem(LocalDate date1, LocalDate date2, LocalDate date3, String costomer_type){
        this.date1=date1;
        this.date2=date2;
        this.date3=date3;
        this.costomer_type=costomer_type;
    }
    public static LocalDate getDate1() {
        return date1;
    }

    public void setDate1(LocalDate date1) {
        this.date1 = date1;
    }
    public static LocalDate getDate2() {
        return date2;
    }

    public void setDate2(LocalDate date2) {
        this.date2 = date2;
    }
    public static LocalDate getDate3() {
        return date3;
    }

    public void setDate3(LocalDate date3) {
        this.date3= date3;
    }

    public static String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public static String getCostomer_type() {
        return costomer_type;
    }

    public void setCostomer_type(String costomer_type) {
        this.costomer_type = costomer_type;
    }


}
