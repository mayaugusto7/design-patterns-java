package behaviorial.chain_of_responsability.orcs.handlers;

import behaviorial.chain_of_responsability.orcs.requests.Request;
import behaviorial.chain_of_responsability.orcs.requests.RequestHandler;
import behaviorial.chain_of_responsability.orcs.requests.RequestType;

public class OrcSoldier extends RequestHandler {
    public OrcSoldier(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.TORTURE_PRISONER)) {
            printHandling(request);
            request.markHandled();
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Orc soldier";
    }
}
