import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This test class contains test methods covering the methods of the CustomerSystemClass
 */
class CustomerSystemTest {
    /**
     * This test methods covers the getNewCustomerID method of the CustomerSystem Class
     *
     * It checks, if we get different CustomerIDs, if we run this method two time in a row.
     */
    @Test
    void getNewCustomerID() {
        //testing if second ID is not equal to first
        int firstID = CustomerSystem.getNewCustomerID();
        int secondID = CustomerSystem.getNewCustomerID();
        assertFalse(firstID== secondID);
    }
    /**
     * This test methods covers the getNewBankAccountNumber method of the CustomerSystem Class
     *
     * It checks, if we get different BankAccountNumbers, if we run this method two times in a row.
     */
    @Test
    void getNewBankAccountNumber() {
        int accNr1 = CustomerSystem.getNewBankAccountNumber();
        int accNr2 = CustomerSystem.getNewBankAccountNumber();
        assertFalse(accNr1== accNr2);
    }
}