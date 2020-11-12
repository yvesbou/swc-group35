public abstract class CustomerSystem {
    static int customerID=0;
    static int bankAccountNumber =0;
    static int getNewCustomerID(){
        int newID = customerID;
        ++customerID;
        return newID;
    }
    static int getNewBankAccountNumber(){
        int newNumber = bankAccountNumber;
        ++bankAccountNumber;
        return newNumber;
    }
}
