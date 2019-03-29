import java.sql.SQLOutput;

public class Assignment6 {
    public static void main(String[] args) {
        String rick ="Of all the gin joints in all the towns in the world, she walks in to mine.";
        System.out.println("The length of the rick string is "+rick.length());
        String renault="I'm shocked, shocked to find that gambling is going on in here!";
        String phrase ="Play it, Sam. Play ‘As Time Goes By.'";

        System.out.println("The value displayed by the expression renault.length is "+renault.length());
        System.out.println("The returned value  by the method call is "+renault.charAt(25));
        String[] arenault = renault.split(" ");
        System.out.println("This make the word \"shocked\" to Uppercase: "+arenault[0]+" "+arenault[1].toUpperCase());
        System.out.println("This make the word \"shocked\" to Uppercase: "+renault.replaceFirst("shocked","SHOCKED"));
        System.out.println("The length of phrase String is "+phrase.substring(19,35).length());
        System.out.println("String returned by phrase String is "+phrase.substring(14,35));
    }
}