package behaviorial.chain_of_responsability.orcs.requests;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class RequestHandler {
    private final RequestHandler next;

    protected RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        if (next != null) {
            next.handleRequest(request);
        }
    }

    public void printHandling(Request request) {
        log.info("{} handling request \"{}\"", this, request);
    }

    @Override
    public abstract String toString();
}
