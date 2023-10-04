public class Main {
    public static void main(String[] args) {
        Weekday[] day = Weekday.values();
        for (int i = 0; i < day.length; i++) {
            System.out.println(day[i] + " ");
        }


        System.out.println(Weekday.Monday.isHoliday());
        System.out.println(Weekday.Monday.isWeekDay());

    }

}
