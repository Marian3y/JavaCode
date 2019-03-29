public class Quiz2 {
    public static void main(String[] args) {


        String answer;
        answer = test(2);
        System.out.println(answer);
        answer = test(3);
        System.out.println(answer);
        answer = test(5);
        System.out.println(answer);
        answer = test(4);
        System.out.println(answer);
        answer = test(1);
        System.out.println(answer);
        answer = test(0);
        System.out.println(answer);

        for(int i=0;i>6;i++){
            System.out.println("equals"+i);
        }
    }

    static String test(int number) {
        String answer="";

        if (number == 2 || number == 3 || number == 5) {
            answer = "This Number " + number + " is prime.";
        }
        if (number == 4) {
            answer = "This Number " + number + " a perfect square.";
        }
        if (number == 1) {
            answer = "This Number " + number + " is the unit number";
        }
        if (number == 2 || number == 4) {
            answer += "This Number " + number + " is even";
        }
        if (number == 0) {
            answer = "This Number " + number + " is 0";
        }
        return answer;
    }
}
