import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class HotelReservationSystemTest {
    @Test
    public void HotelReservationSystem_ShouldResturn_Lakewood(){
        ReservationSystem reservationSystem=new ReservationSystem();
        reservationSystem.reservationSystem(LocalDate.of(2020,03,16),LocalDate.of(2020,03,17),LocalDate.of(2020,03,18),"regular");
       // reservationSystem.reservationSystem("26March2020(thur)","27March2020(fri)","28March2020(sat)","reward");
        String HotelName=HotelReservationSystem.getHotelname();
        Assertions.assertEquals("Lakewood",HotelName);
    }
    @Test
    public  void HotelReservationSystem_ShouldResturn_Ridgewood() {
        ReservationSystem reservationSystem=new ReservationSystem();
      //  reservationSystem.reservationSystem("16March2020(mon)","17March2020(tue)","18March2020(wed)","regular");
        reservationSystem.reservationSystem(LocalDate.of(2020,03,26),LocalDate.of(2020,03,27),LocalDate.of(2020,03,28),"reward");
        String HotelName=HotelReservationSystem.getHotelname();
        Assertions.assertEquals("Ridgewood",HotelName);

    }

}
