import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class HotelReservationSystem {
    public static final int LakeWood_regular_weekday_rate=110;
    public static final int LakeWood_reward_weekday_rate=80;
    public static final int LakeWood_regular_weekendday_rate=90;
    public static final int LakeWood_reward_weekendday_rate=80;
    public static final int Bridgewood_regular_weekday_rate=160;
    public static final int BridgeWood_reward_weekday_rate=110;
    public static final int Bridgewood_regular_weekendday_rate=60;
    public static final int BridgeWood_reward_weekendday_rate=50;
    public static final int Ridgewood_regular_weekday_rate=220;
    public static final int RidgeWood_reward_weekday_rate=100;
    public static final int Ridgewood_regular_weekendday_rate=150;
    public static final int RidgeWood_reward_weekendday_rate=40;
    public static int LakeWood_cost=0;
    public static int BridgeWood_cost=0;
    public static int RidgeWood_cost=0;
    public  static int LakeWood_rating=3;
    public static int Bridgewood_rating=4;
    public static int Ridgewood_rating=5;
    public static void dates1() {
        String[] WeekEndDays = {"Saturday", "Sunday"};
        List<String> WeekDays = Arrays.asList(WeekEndDays);
        String[] NormalDays = {"Monday", "Tuesday", "Wednessday", "Thursday", "Friday"};
        List<String> NormalDay = Arrays.asList(NormalDays);
        for (int i = 0; i < WeekDays.size(); i++) {
            if (getLocalDate(ReservationSystem.getDate1()).contains(WeekDays.get(i))) {
                System.out.println("week end days");
                Weekendrates();
            }

            if(getLocalDate(ReservationSystem.getDate2()).contains(WeekDays.get(i))) {
                System.out.println("week end days");
                Weekendrates();
            }

            if(getLocalDate(ReservationSystem.getDate3()).contains(WeekDays.get(i))) {
                System.out.println("week end days");
                Weekendrates();
            }
        }
        for(int i=0;i<NormalDay.size();i++){
            if (getLocalDate(ReservationSystem.getDate1()).contains(NormalDay.get(i))) {
                System.out.println("normal days");
                Normaldayrates();
            }
            if(getLocalDate(ReservationSystem.getDate2()).contains(NormalDay.get(i))){
                System.out.println("normal days");
                Normaldayrates();
            }
            if(getLocalDate(ReservationSystem.getDate3()).contains(NormalDay.get(i))){
                System.out.println("normal days");
                Normaldayrates();
            }

        }
        calculateCost();

    }
    public static void Weekendrates(){
        if(ReservationSystem.getCostomer_type().equals("regular")){
            System.out.println("regular customer");
            LakeWood_cost=LakeWood_cost+LakeWood_regular_weekendday_rate;
            BridgeWood_cost=BridgeWood_cost+Bridgewood_regular_weekendday_rate;
            RidgeWood_cost=RidgeWood_cost+Ridgewood_regular_weekendday_rate;

        }else{
            System.out.println("reward customer");
            LakeWood_cost=LakeWood_cost+LakeWood_reward_weekendday_rate;
            BridgeWood_cost=BridgeWood_cost+BridgeWood_reward_weekendday_rate;
            RidgeWood_cost=RidgeWood_cost+RidgeWood_reward_weekendday_rate;
        }
    }
    public static void Normaldayrates(){
        if(ReservationSystem.getCostomer_type().equals("regular")){
            System.out.println("regular customer");
            LakeWood_cost=LakeWood_cost+LakeWood_regular_weekday_rate;
            BridgeWood_cost=BridgeWood_cost+Bridgewood_regular_weekday_rate;
            RidgeWood_cost=RidgeWood_cost+Ridgewood_regular_weekday_rate;
        }else{
            System.out.println("reward customer");
            LakeWood_cost=LakeWood_cost+LakeWood_reward_weekday_rate;
            BridgeWood_cost=BridgeWood_cost+BridgeWood_reward_weekday_rate;
            RidgeWood_cost=RidgeWood_cost+RidgeWood_reward_weekday_rate;
        }
    }
    public static String calculateCost(){

        System.out.println("Lakewood="+LakeWood_cost);
        System.out.println("Bridgewood="+BridgeWood_cost);
        System.out.println("Ridgewood="+RidgeWood_cost);
        if(LakeWood_cost<BridgeWood_cost&&LakeWood_cost<RidgeWood_cost){
            System.out.println("Lake wood is cheepest");
            return "Lakewood";
        }else if(BridgeWood_cost<LakeWood_cost&&BridgeWood_cost<RidgeWood_cost){
            System.out.println("Bridge wood is cheepest");
            return "BridgeWood";
        }else if(RidgeWood_cost<LakeWood_cost&&RidgeWood_cost<BridgeWood_cost){
            System.out.println("Ridge wood is cheepest");
            return "Ridgewood";
        }else{
            if(LakeWood_rating>Bridgewood_rating&&LakeWood_rating>Ridgewood_rating){
                System.out.println("Lake wood is cheepest");
                return "Lakewood";
            }else if(Bridgewood_rating>LakeWood_rating&&Bridgewood_rating>Ridgewood_rating){
                System.out.println("Bridge wood is cheepest");
                return "Bridgewood";
            }else if(Ridgewood_rating>LakeWood_rating&&Ridgewood_rating>Bridgewood_rating){
                System.out.println("Ridge wood is cheepest");
                return "Ridgewood";
            }
        }


        return null;
    }
    public static String getLocalDate(LocalDate date){
        Calendar cal = GregorianCalendar.getInstance();
        cal.set(date.getYear(),date.getMonthValue(),date.getDayOfMonth());

        // this formatter will have the current locale
        SimpleDateFormat format = new SimpleDateFormat("EEEE");

        return  format.format(cal.getTime());
    }

    public static String getHotelname() {
        dates1();
        return  calculateCost();
    }


}
