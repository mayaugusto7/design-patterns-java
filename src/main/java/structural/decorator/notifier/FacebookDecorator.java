package structural.decorator.notifier;

public class FacebookDecorator extends NotifierDecorator {

    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
