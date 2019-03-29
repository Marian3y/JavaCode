import java.util.Scanner;
public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
        System.out.println("Enter your state: ");
            String state = sc.nextLine();
       System.out.print("Enter your year of birth: ");
        int year = sc.nextInt();
        if (state.equalsIgnoreCase("TX")) {
            System.out.println("Howdy! " + name + " I see you were born in " + year);
        }
        else if (state.equalsIgnoreCase("HI")) {
            System.out.println("Aloha! " + name + " I see you were born in " + year);
        }
        else if (state.equalsIgnoreCase("NY")) {
            System.out.println("Yo! " + name + " I see you were born in " + year);
        }
        else {
            System.out.println("Hello! " + name + " I see you were born in " + year);
        }
        int yearOfRetirement = (year + 66);
        int age = (2018-year);
        int ageToAdd=(66-age);
        int yourAgeOfRetirement =(age+ageToAdd);
        System.out.println("You have "+ageToAdd+" years more and you will be "+yourAgeOfRetirement+" in "+yearOfRetirement+ " I hope you enjoy retirement in "+state );

    }
}
