package behaviorial.chain_of_responsability.orcs.requests;

public class Request {
    private final RequestType requestType;
    private final String requestDescription;
    private boolean handled;

    public Request(final RequestType requestType, final String requestDescription) {
        this.requestType = requestType;
        this.requestDescription = requestDescription;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public void markHandled() {
        this.handled = true;
    }

    public boolean isHandled() {
        return handled;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }
}
