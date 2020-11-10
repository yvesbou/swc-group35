package src;
public interface Customer {
    public void deposit(int amount);
    public int withdraw(int amount);
    public void payment_wCreditCard(CreditCard card, int amount);
    public void payment_wBankTransfer();
}
