public class Bmw implements InterfaceTest {

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void refuel() {
        System.out.println("refuel");
    }
}
