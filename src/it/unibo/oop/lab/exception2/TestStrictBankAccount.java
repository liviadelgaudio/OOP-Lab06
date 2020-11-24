package it.unibo.oop.lab.exception2;

import org.junit.Test;

/**
 * JUnit test to test
 * {@link StrictBankAccount}.
 * 
 */
public class TestStrictBankAccount {

    /**
     * Used to test Exceptions on {@link StrictBankAccount}.
     */
    @Test
    public void testBankOperations() {
        /*
         * 1) Creare due StrictBankAccountImpl assegnati a due AccountHolder a
         * scelta, con ammontare iniziale pari a 10000 e nMaxATMTransactions=10
         */
    	AccountHolder user1 = new AccountHolder("Mario", "Rossi", 1234);
    	AccountHolder user2 = new AccountHolder("Sara", "Lolli", 3478);
    	
    	StrictBankAccount acc1 = new StrictBankAccount(1234, 10000, 10);
    	StrictBankAccount acc2 = new StrictBankAccount(3478, 10000, 10);
    	
         /* 2) Effetture un numero di operazioni a piacere per verificare che le
         * eccezioni create vengano lanciate soltanto quando opportuno, cioè in
         * presenza di un id utente errato, oppure al superamento del numero di
         * operazioni ATM gratuite.
         */
    	
    	try {
			acc1.deposit(1233, 100);
			acc2.withdraw(3478, 10001);
			for(int i=0; i <= 10; i++) {
    			acc1.withdrawFromATM(1234, 1000);
			}
		} catch (WrongAccountHolderException e) {
			e.toString();
    	} catch (NotEnoughFoundsException e) {
    		e.toString();
    	} catch(TransactionsOverQuotaException e) {
    		e.toString();
    	}
    } 
}
