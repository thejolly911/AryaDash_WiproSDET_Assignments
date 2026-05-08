package AbstractClassRank;

public class BankMain {
    public static void main(String[] args) {

        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        System.out.println("SBI Rate: " + b1.getInterestRate());
        System.out.println("HDFC Rate: " + b2.getInterestRate());
    }
}
