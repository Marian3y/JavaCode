
public class MethodTest {
    public static void main(String[] args) {
        MethodTest method = new MethodTest();


        String msg = method.test("This is test 1");

        System.out.println(msg);
        String msg2 = method.test2("-666");
        //String num2 = method.test("-666");
        System.out.println(msg2);
        String msg3 = method.test3("-1111");
        //String num4 = method.test("1111-");
        //String msg3 = method.test("This is last test");
        System.out.println(msg3);

        ////System.out.println(msg2);

        //msg = method.getDate();

    }

    public String test(String mergeStrings) {
        return "100-" + mergeStrings;
    }

    public String test2(String mergeStrings) {
        return "123-" + mergeStrings;
    }
    public String test3(String mergeStrings) {
        return "99" + mergeStrings+"-This is the last test";
    }
}



    //public String getDate() {
       // Date date = new Date();
       // return date.toString();
   // }

   // public String getdate(String datePart){
     //   Date date = new Date();
       // if (datePart)


    //}

