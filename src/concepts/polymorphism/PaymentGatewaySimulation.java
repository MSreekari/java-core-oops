package concepts.polymorphism;

abstract class PaymentMethod{

    abstract void pay(double amount);
}
class CreditCardPayment extends PaymentMethod {
    private String cardHolderName;
    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public CreditCardPayment(String cardHolderName, String cardNumber, String expirationDate, String cvv) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    void pay(double amount) {
        if(this.cardNumber == null || this.cardNumber.length() <= 8){
            System.out.println("Invalid card number");
        }if(amount < 0){
            System.out.println("Invalid amount");
        }else{
            System.out.println("Paid " + amount + " using credit card");
        }
    }

    public String getCardHolderName() {
        return cardHolderName;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public String getExpirationDate() {
        return expirationDate;
    }
    public String getCvv() {
        return cvv;
    }
}
class PayPalPayment extends PaymentMethod {
    private String payPalAccountNumber;
    private String emailAddress;
    private String getPayPalAccountNumber;

    public PayPalPayment(String payPalAccountNumber, String emailAddress, String getPayPalAccountNumber) {
        this.payPalAccountNumber = payPalAccountNumber;
        this.emailAddress = emailAddress;
        this.getPayPalAccountNumber = getPayPalAccountNumber;
    }
    @Override
    void pay(double amount) {
        if(this.payPalAccountNumber == null || this.payPalAccountNumber.length() <= 8){
            System.out.println("Invalid pay pal account");
        }else{
            System.out.println("Paid " + amount + " using Pay pal account");
        }
    }
}
class CryptoPayment extends PaymentMethod {
    private String cryptoAccountNumber;
    private String emailAddress;

    public CryptoPayment(String cryptoAccountNumber, String emailAddress) {
        this.cryptoAccountNumber = cryptoAccountNumber;
        this.emailAddress = emailAddress;
    }
    public String getCryptoAccountNumber() {
        return cryptoAccountNumber;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public String getPayPalAccountNumber() {
        return cryptoAccountNumber;
    }

    @Override
    void pay(double amount) {
        if(this.cryptoAccountNumber == null || this.cryptoAccountNumber.length() <= 8){
            System.out.println("Invalid crypto account");
        }else{
            System.out.println("Paid " + amount + " using Crypto wallet account");
        }
    }
}
public class PaymentGatewaySimulation {
    static void executePayment(PaymentMethod method, double amount){
        method.pay(amount);
    }
    public static void main(String[] args) {
        CreditCardPayment card = new CreditCardPayment("Palak", "4566487799757", "10", "745");
        PayPalPayment paypal = new PayPalPayment("568845786785695", "eugrygfe@gmail.com", "20i395756157434");
        CryptoPayment cryptoPayment = new CryptoPayment("84878576t264r", "ihruigy@gmail.com");
        executePayment(card, 50000);
        executePayment(paypal, 50000);
        executePayment(cryptoPayment, 50000);
    }
}
