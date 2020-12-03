public class EmployeeView {
    public void printEmployee(String name, String surname, String address, String telephoneNumber, int ID){
        System.out.println("Employee:");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Address: " + address);
        System.out.println("Telephone Number: " + telephoneNumber);
        System.out.println("ID: " + ID);
    }
    public void printName(String name){
        System.out.println("Name: " + name);}
    public void printSurname(String surname){
        System.out.println("Surname: " + surname);}
    public void printTelephoneNumber(String address){
        System.out.println("Address: " + address);}
    public void printAddress(String telephoneNumber){
        System.out.println("Telephone Number: " + telephoneNumber);}
    public void printID(int ID){
        System.out.println("ID" + ID);}
}
