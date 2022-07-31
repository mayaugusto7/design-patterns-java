package behaviorial.chain_of_responsability.atm.chain_handle;

import behaviorial.chain_of_responsability.atm.base.Currency;
import behaviorial.chain_of_responsability.atm.base.DispenseChain;

public class Dollar50Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 50) {
            int num = currency.getAmount() / 50;
            int reminder = currency.getAmount() % 50;
            System.out.println("Dispensing " + num + " 50$ note");
            if (reminder != 0) {
                this.chain.dispense(new Currency(reminder));
            }
        } else {
            this.chain.dispense(currency);
        }
    }
}
