import java.util.Scanner;

public class Switch1
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a day name: ");
        String input = scan.nextLine();

        switch(input.toUpperCase()){
            case "MONDAY":
            case "MON":
                print("1");
                break;
            case "TUESDAY":
            case "TUES":
                print("2");
                break;
            case "WEDNESDAY":
            case "WED":
                print("3");
                break;
            case "THURSDAY":
            case "THURS":
                print("4");
                break;
            case "FRIDAY":
            case "FRI":
                print("5");
                break;
            case "SATURDAY":
            case "SAT":
                print("6");
                break;
            case "SUNDAY":
            case "SUN":
                print("0");
                break;
            default: print("I don't understand");
        }
    }
    private static void print(String str){
        System.out.println(str);
    }
}
