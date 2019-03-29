
import java.util.Scanner;

public class Experiments {
    public static void main(String[] args) {
        String favoriteDrink ="Mocha Caramel Coffee";
        String Car = "Lamborghini";
        String FavoriteColor = "Red";
        String FavoritePlace = "Beach";

        System.out.println("Favorite Drink is "+favoriteDrink.toUpperCase());
        int index = Car.indexOf("i");
        System.out.println("Index of Car is " +index);
        index = Car.lastIndexOf("h");
        System.out.println("Last index of Car is " +index);

        boolean endsWith = favoriteDrink.endsWith("Mocha Caramel Coffee");
        System.out.println("favorite Drink endswith? "+endsWith);

        boolean equal = favoriteDrink.equals("Mocha Coffee");
        System.out.println("Favorite Drink is? "+equal);
        equal = favoriteDrink.equalsIgnoreCase("Mocha Caramel coffee");
        System.out.println("Favorite Drink is? "+equal);

       String[] aFavoriteDrink = favoriteDrink.split(" ");
        System.out.println("Favorite Drink is "+aFavoriteDrink.length);

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter a string ");

            String what = sc.nextLine();

            if ( what.endsWith(".") )

                break;

            System.out.println(what);

            System.out.println("Length = " + what.length());

            System.out.println("How many words? " + what.split(" ").length);

            System.out.println("Does it start with a X? " + what.startsWith("X"));

            System.out.println("Do you see a J in the phrase? " + what.contains("J") + " where was it " + what.indexOf("J"));

        }






    }
}
