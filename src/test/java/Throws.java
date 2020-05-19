public class Throws {

    public static void main(String[] args) {

        Throws th = new Throws();
        th.sum();
        System.out.println("abc");

    }

    public void sum() {
        try {
            division();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void division() throws ArithmeticException {
        int i = 9/0;
    }
}
