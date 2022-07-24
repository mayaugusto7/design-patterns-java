package structural.decorator.notifier;

public class Message implements Notifier {

    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
