import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerSystemTest {

    @Test
    void getNewCustomerID() {
        //testing if second ID is not equal to first
        int firstID = CustomerSystem.getNewCustomerID();
        int secondID = CustomerSystem.getNewCustomerID();
        assertFalse(firstID== secondID);
    }

    @Test
    void getNewBankAccountNumber() {
        int accNr1 = CustomerSystem.getNewBankAccountNumber();
        int accNr2 = CustomerSystem.getNewBankAccountNumber();
        assertFalse(accNr1== accNr2);
    }
}