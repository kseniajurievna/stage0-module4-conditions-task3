package school.mjc.stage0.conditions.task3;

public class Seasons {
    public static void tellTheSeasonByMonthNumber(int month) {
        String[] seasons = {"winter", "winter", "spring", "spring", "spring","summer", "summer", "summer", "fall", "fall", "fall", "winter"};
        if (month > 12 || month < 1) {
            System.out.println("wrong number!");
        }
        System.out.println(seasons[month-1]);

    }
    public static void main(String[] args){
        tellTheSeasonByMonthNumber(1);
    }
}

//        if (month == 12 || month == 1 || month == 2){
//            System.out.println("winter");
//        } else if (month == 3 || month == 4 || month ==5){
//            System.out.println("spring");
//        } else if (month == 6 || month == 7 || month == 8){
//            System.out.println("summer");
//        } else if (month == 9 || month == 10 || month == 11){
//            System.out.println("fall");
//        } else {
//            System.out.println("wrong number!");
//        }