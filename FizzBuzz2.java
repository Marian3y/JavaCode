public class FizzBuzz2 {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++)
        {
            String num="";

            if(i%3==0)
                num+="Fizz";
            if(i%5==0)
                num+="Buzz";
            if(num.length()==0)
                num=Integer.toString(i);

            System.out.println(num);
        }

    }
}
