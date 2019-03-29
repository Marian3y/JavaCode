public class LoopingExperiment2 {
    public static void main(String[] args) {


        for (int i = 0; i <= 20; i++) {
            String test = "";
            test +=(i%3)==0 ? "fizz": "";
            test +=(i%5)==0 ? "buzz": "";
            System.out.println(!test.isEmpty()? test :i);

        }
        for(int i = 0; i < 20; i++, System.out.println(i % 3 == 0 || i % 5 == 0 ? ((i % 3) == 0 ? "fizz" : "") + ((i % 5) == 0 ? "buzz" : "")  : i));
    }

    }

