import com.google.inject.Singleton;

public class SingleTonDemo {

    private static SingleTonDemo singleton_instance = null;
    public String str;

    private SingleTonDemo() {
        str = "Single ton pattern";
    }

    public static SingleTonDemo getInstance() {
        if(singleton_instance == null)
            singleton_instance = new SingleTonDemo();
            return singleton_instance;
    }

    public static void main(String[] args) {
        SingleTonDemo x =  SingleTonDemo.getInstance();
        SingleTonDemo y =  SingleTonDemo.getInstance();
        SingleTonDemo z =  SingleTonDemo.getInstance();

        x.str = (x.str).toUpperCase();
        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);

        z.str = (z.str).toLowerCase();
        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);
    }
}
