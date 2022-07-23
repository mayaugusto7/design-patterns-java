package behavior.templatemethod.redesocial;

public abstract class Network {
    String userName;
    String password;

    public Network() {}

    public boolean post(String message) {
        if (logIn(this.userName, this.password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }

        return false;
    }

    protected abstract boolean logIn(String userName, String password);
    protected abstract boolean sendData(byte[] bytes);
    protected abstract void logOut();
}
