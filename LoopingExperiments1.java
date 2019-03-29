import java.sql.SQLOutput;

public class LoopingExperiments1 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if(i%3==0) {
                System.out.println("fizz " + i);
            }
            if(i%5==0){
             System.out.println("buzz "+i);
            }
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(((i % 3) == 0 ? "fizz" : "") + ((i % 5) == 0 ? "buzz" : ""));

            }


        }
    }
}
