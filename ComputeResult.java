public class ComputeResult {
    public static void main (String[] args) {
        String original = "Java Software";
        int   space  = original.indexOf(' ');
        String soft  = original.substring(space+1,space+5);
        String ware  = original.substring(9);
        System.out.println(ware.toUpperCase() + " " + soft.toLowerCase());

        String[] words ="This is a string with how many words".split(" ");
        System.out.println("this is the 4th word in the string " +words[3]);
        System.out.println("The string had how many words? " +words.length);

        String replace = original.replace("a","_");
        System.out.println(replace);
        System.out.println(original.replaceFirst("a","_"));

        String myClass = "Java programming language";
        int firstA = myClass.indexOf("a");
        int secondA = myClass.indexOf("a",firstA+1);
        //todo System.out.println("this will result second a in myClass"+myClass.substring(0,secondA) + "o" +myClass.substring("a",secondA);
        //this code is first entered on github on august 10

        System.out.println();
    }
}