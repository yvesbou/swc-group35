public abstract class CustomerSystem {
    static int customerID=0;
    static int bankAccountNumber =0;
    static int getNewCustomerID(){
        ++customerID;
        int newID = customerID;
        return newID;
    }
    static int getNewBankAccountNumber(){
        ++bankAccountNumber;
        int newNumber = bankAccountNumber;
        return newNumber;
    }
}
