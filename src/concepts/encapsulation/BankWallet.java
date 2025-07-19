package concepts.encapsulation;

class Wallet{
    private double balance;

    public Wallet(double balance){
        this.balance = balance;
    }

    public void addAmount(double amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println("Added amount to wallet: " + amount);
        }else{
            System.out.println("Error: Amount cannot be negative");
        }
    }

    public void spend(double amount){
        if(this.balance > amount){
            this.balance -= amount;
            System.out.println("Spent amount from wallet: " + amount);
        }else{
            System.out.println("Balance is not enough to spend");
        }
    }

    public void canAfford(double amount){
        if(this.balance < amount){
            System.out.println("Balance is not enough to afford");
        }else{
            System.out.println("Congratulations. You can afford it.");
        }
    }
    public void getBalance(){
        System.out.println("Balance is: " + this.balance);
    }
}
public class BankWallet {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(140600);
        wallet.addAmount(14600);
        wallet.canAfford(36577);
        wallet.spend(36577);
        wallet.getBalance();
        wallet.spend(36577);
    }
}
