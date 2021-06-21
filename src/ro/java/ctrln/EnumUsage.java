package ro.java.ctrln;

public class EnumUsage {

   // enum Weekday {MONDAY, TUESDAY};

    public static void main(String[] args) {

        WeekDay weekDay = WeekDay.SUNDAY;

        switch (weekDay) {
            case MONDAY:
                System.out.println("Luni");
                break;
            case TUESDAY:
                System.out.println("Marti");
                break;
            case WEDNSEDAY:
                System.out.println("Miercuri");
                break;
            case THURSDAY:
                System.out.println("Joi");
                break;
            case FRIDAY:
                System.out.println("Viner");
                break;
            case SATURDAY:
                System.out.println("Sambata");
                break;
            case SUNDAY:
                System.out.println("Duminica");
                System.out.println(WeekDay.SUNDAY.name());
                break;
            default:
                System.out.println("Zi necunoscuta");


        }


    }
}
