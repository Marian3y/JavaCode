public class LoopExamples {
    public static void main(String[] args) {
        for (int i =0 ; i < 11; i++) {
         if(i%2==0)
         System.out.println("for loop Even Number" + i);

         }

        int count = 0;
        while (count < 11) {
            if (count % 2 == 0)
                System.out.println("While Even Number " + count);
            count++;
        }

        int count1 = 0;
        do {
            if (count1 % 2 == 0)
            System.out.println ("Do-While Even Number: " + count1);
            count1++;
        } while (count1 < 11);


    }
}


