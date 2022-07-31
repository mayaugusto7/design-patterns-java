package behaviorial.chain_of_responsability.atm.base;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}
