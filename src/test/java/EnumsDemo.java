import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

enum Mobile {

    APPLE,SAMSUNG,STC;
}

public class EnumsDemo {


    public static void main(String[] args) {

        System.out.println(Mobile.APPLE);
        Mobile m = Mobile.APPLE;

        switch (m) {
            case APPLE:
                System.out.println("Apple");
                break;
            case SAMSUNG:
                System.out.println("Samsung");
                break;

        }
    }
}
