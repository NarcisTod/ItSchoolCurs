package session6;

public class CoolSwitchClass {
    static void main() {

        String day = "Friday";

        switch (day){
            case "Monday" -> System.out.println("Today is Monday");
            case "Tuesday" -> System.out.println("Today is Tuesday");
            case "Wednesday" -> System.out.println("Today is Wednesday");
            case "Thrusday" -> System.out.println("Today is Thursday");
            case "Friday" ->
            {
                System.out.println("Today is Friday");
                System.out.println("still Friday");
            }
            default -> System.out.println("Weekday");
        }
    }
}
