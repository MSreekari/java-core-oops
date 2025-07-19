package concepts.classes_and_objects;

class BankAccount{
    int accountNumber;
    String holderName;
    double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void getDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println(this.holderName + " Current Balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(this.holderName + " Deposited " + amount);
    }

    public void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(this.holderName + " Withdrawn " + amount);
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    public void displayBalance(){
        System.out.println("Your balance is " + balance);
    }
}
public class ATMMachineSimulator {
    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount(1, "Jack", 10000);
        BankAccount customer2 = new BankAccount(2, "Payal", 14000);
        BankAccount customer3 = new BankAccount(3, "Goyal", 16000);
        customer1.getDetails();
        customer1.deposit(500);
        customer1.displayBalance();
        customer2.getDetails();
        customer2.withdraw(500);
        customer2.displayBalance();
        customer3.getDetails();
        customer3.deposit(6589);
        customer3.withdraw(7886);
        customer3.displayBalance();
    }
}
