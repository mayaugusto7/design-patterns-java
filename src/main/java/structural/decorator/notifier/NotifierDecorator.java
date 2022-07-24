package structural.decorator.notifier;

public class NotifierDecorator implements  Notifier {

    private final Notifier wrappee;

    public NotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
