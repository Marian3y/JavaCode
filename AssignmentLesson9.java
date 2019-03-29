
public class AssignmentLesson9 {
    public static void main(String[] args) {
        String msg;
        msg = test(100,"This is test 1");
        System.out.println(msg);
        msg = test(123,-66);
        System.out.println(msg);
        msg = test(99,1111,"This is the last test");
        System.out.println(msg);
    }


    static String test(int name1, String name2) {
        //String msg;

         return name1+"-"+name2;
       // return msg;
    }
    static String test(int name3, int name4) {
        //String msg;

       return name3+"-"+name4;
        //return msg;
    }
    static String test(int name3, int name4, String name5) {
        //String msg;

      return name3+"-"+name4+"-"+name5;
        //return msg;
    }
}