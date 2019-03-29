public class SwitchAssignment2 {
    public static void main(String[] args) {
        String number;
        number = test("Monday");
        System.out.println("Monday "+number);
        number = test("Tuesday");
        System.out.println("Tuesday "+number);
        number = test("Wednesday");
        System.out.println("Wednesday "+number);
        number = test("Thursday");
        System.out.println("Thursday "+number);
        number = test("Friday");
        System.out.println("Friday "+number);
        number = test("Saturday");
        System.out.println("Saturday "+number);
        number = test("Sunday");
        System.out.println("Sunday "+number);
    }


    static String test(String days) {
        String number="";
        switch (days.toUpperCase()) {
            case "MONDAY":
            case "MON":
                number = "1";
                break;
            case "TUESDAY":
            case "TUES":
                number = "2";
                break;
            case "WEDNESDAY":
            case "WED":
                number = "3";
                break;
            case "THURSDAY":
            case "THURS":
                number = "4";
                break;
            case "FRIDAY":
            case "FRI":
                number = "5";
                break;
            case "SATURDAY":
            case "SAT":
                number = "6";
                break;
            case "SUNDAY":
            case "SUN":
                number = "0";
                break;
        }

        return number;
    }
}