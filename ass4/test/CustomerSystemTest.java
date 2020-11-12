import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerSystemTest {

    @Test
    void getNewCustomerID() {
        //testing if second ID is not equal to first
        int firstID = CustomerSystem.getNewCustomerID();
        int secondID = CustomerSystem.getNewBankAccountNumber();
        assertFalse(firstID== secondID);
    }

    @Test
    void getNewBankAccountNumber() {
        int firstID = CustomerSystem.getNewCustomerID();
        int secondID = CustomerSystem.getNewBankAccountNumber();
        assertFalse(firstID== secondID);
    }
}