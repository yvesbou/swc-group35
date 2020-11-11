public abstract class CreditCardValidation {
    private static int serialNumber = 0;
    private static int securityNumber = 100;
    public static int getNewSerialNumber(){
        int newNumber = serialNumber;
        ++serialNumber;
        return serialNumber;
    }
    public static int getNewSecurityNumber(){
        int newNumber = securityNumber;
        ++securityNumber;
        return securityNumber;
    }

}
