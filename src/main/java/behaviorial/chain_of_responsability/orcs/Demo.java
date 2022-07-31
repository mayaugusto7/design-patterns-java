package behaviorial.chain_of_responsability.orcs;

import behaviorial.chain_of_responsability.orcs.clients.OrcKing;
import behaviorial.chain_of_responsability.orcs.requests.Request;
import behaviorial.chain_of_responsability.orcs.requests.RequestType;

public class Demo {

    public static void main(String[] args) {
        OrcKing king = new OrcKing();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
    }
}
