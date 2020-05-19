import com.test.ExceptionTimeoutTest;

public class ExceptionHandling {
    int a = 10;
    public static void main(String[] args) {

//        int i = 9/0;
//        System.out.println(i);

//        Thread.sleep(2000);

        //int a = 10;
//        ExceptionHandling obj = new ExceptionHandling();
//        obj = null;
//        System.out.println(obj.a);

        //1. try catch exception
        try {
            int i = 9/0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("ABC");
    }
}
