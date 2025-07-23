package concepts.abstraction;

interface ATM{

    abstract void insertCard();

    abstract void authenticate();

    abstract void withdrawMoney();
}
class SBI implements ATM{

    @Override
    public void insertCard() {
        System.out.println("SBI card inserted");
    }

    @Override
    public void authenticate() {
        System.out.println("Authenticated using SBI card");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Withdrawing money");
    }
}
public class ATMMachine {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.insertCard();
        sbi.authenticate();
        sbi.withdrawMoney();
    }
}
