import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChiefOfCustomersTest {

    @Test
    void getNewCustomerID() {
        //testing if second ID is not equal to first
        int firstID = ChiefOfCustomers.getNewCustomerID();
        int secondID = ChiefOfCustomers.getNewBankAccountNumber();
        assertFalse(firstID== secondID);
    }

    @Test
    void getNewBankAccountNumber() {
        int firstID = ChiefOfCustomers.getNewCustomerID();
        int secondID = ChiefOfCustomers.getNewBankAccountNumber();
        assertFalse(firstID== secondID);
    }
}