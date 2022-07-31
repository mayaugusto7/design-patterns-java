package behaviorial.chain_of_responsability.orcs.clients;

import behaviorial.chain_of_responsability.orcs.handlers.OrcCommander;
import behaviorial.chain_of_responsability.orcs.handlers.OrcOfficer;
import behaviorial.chain_of_responsability.orcs.handlers.OrcSoldier;
import behaviorial.chain_of_responsability.orcs.requests.Request;
import behaviorial.chain_of_responsability.orcs.requests.RequestHandler;

public class OrcKing {
    RequestHandler chain;

    public OrcKing() {
        buildChain();
    }

    private void buildChain() {
        chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request request) {
        chain.handleRequest(request);
    }
}
