public class ThrowDemo {

    public static void main(String[] args) {

        System.out.println("ABC");

        try {
            throw new Exception("Test Exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("PQR");

        String exec_flag = "N";
        if(exec_flag.equals("N")) {
            try {
                throw new Exception("Exec flag is Blank Exception");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
