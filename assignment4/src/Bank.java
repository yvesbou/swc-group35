package src;
import java.util.Vector;

public class Bank {

    Vector<BankEmployee> bankEmployees = new Vector<BankEmployee>();
    Vector<Customer> customers = new Vector<Customer>();
    Vector<Technician> technicians = new Vector<Technician>();
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void addBankEmployee(BankEmployee bankEmployee){
        bankEmployees.add(bankEmployee);
    }
    public void addTechnicians(Technician technician){
        technicians.add(technician);
    }

}
