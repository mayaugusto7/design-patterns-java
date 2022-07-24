package structural.decorator.notifier;

public class SMSDecorator extends NotifierDecorator{

    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
