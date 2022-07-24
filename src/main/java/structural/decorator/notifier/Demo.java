package structural.decorator.notifier;

public class Demo {
    public static void main(String[] args) {
        Notifier msg = new Message();
        msg.send("Simples message...");

        NotifierDecorator notifier = new SMSDecorator(msg);
        notifier.send("SMS message send...");

        notifier = new FacebookDecorator(msg);
        notifier.send("Facebook message send...");
    }
}
