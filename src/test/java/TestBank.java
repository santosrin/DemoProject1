public class TestBank {
    public static void main(String[] args) {

        HDFC hdfc = new HDFC();
        hdfc.loan();
        hdfc.credit();
        hdfc.debit();
        hdfc.funds();

        Bank b = new HDFC();
        b.credit();
        b.debit();
        b.loan();

    }
}
