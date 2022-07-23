package behavior.templatemethod.redesocial;

public class Twitter extends Network {

    @Override
    protected boolean logIn(String userName, String password) {
        return false;
    }

    @Override
    protected boolean sendData(byte[] bytes) {
        return false;
    }

    @Override
    protected void logOut() {

    }
}
