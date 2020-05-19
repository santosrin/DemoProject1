
interface Abc
{
    void show();
}

interface Pqr
{
    void xyz();
}

//class AbcImpl implements Abc {
//
//    public void show() {
//        System.out.println("in show");
//    }
//}

public class Interface1 {

    public static void main(String[] args) {

        Abc obj = () -> System.out.println("in show");
        obj.show();

    }

}


