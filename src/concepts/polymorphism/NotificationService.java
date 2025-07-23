package concepts.polymorphism;

abstract class Notification{
    private String message;

    public void send(){}
}
class EmailNotification extends Notification{
    private String email;
    public EmailNotification(String email){
        this.email = email;
    }

    @Override
    public void send(){
        System.out.println(this.email + " is an email notification");
    }
}
class SMSNotification extends Notification{
    private String smsNumber;
    public SMSNotification(String smsNumber){
        this.smsNumber = smsNumber;
    }

    @Override
    public void send(){
        System.out.println(this.smsNumber + " is a sms notification");
    }
}
class PushNotification extends Notification{
    private String pushNumber;
    public PushNotification(String pushNumber){
        this.pushNumber = pushNumber;
    }

    @Override
    public void send(){
        System.out.println(this.pushNumber + " is a push notification");
    }
}
public class NotificationService {
    public static void main(String[] args) {
        EmailNotification email = new EmailNotification("Email Sent");
        SMSNotification sms = new SMSNotification("SMS Sent");
        PushNotification push = new PushNotification("Push Notification");
        email.send();
        sms.send();
        push.send();
    }
}
