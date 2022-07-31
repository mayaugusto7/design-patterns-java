package behaviorial.chain_of_responsability.atm;

import behaviorial.chain_of_responsability.atm.base.Currency;
import behaviorial.chain_of_responsability.atm.base.DispenseChain;
import behaviorial.chain_of_responsability.atm.chain_handle.Dollar10Dispenser;
import behaviorial.chain_of_responsability.atm.chain_handle.Dollar20Dispenser;
import behaviorial.chain_of_responsability.atm.chain_handle.Dollar50Dispenser;

import java.util.Scanner;

public class ATMDispenseChain {
    private DispenseChain chain1;

    public ATMDispenseChain() {
        // initialize the chain
        this.chain1 = new Dollar50Dispenser();
        DispenseChain chain2 = new Dollar20Dispenser();
        DispenseChain chain3 = new Dollar10Dispenser();

        // set next chain of responsibility
        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenseChain = new ATMDispenseChain();

        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be multiple of 10s.");
                return;
            }
            atmDispenseChain.chain1.dispense(new Currency(amount));
        }
    }
}
