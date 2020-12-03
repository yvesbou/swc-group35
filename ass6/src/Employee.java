public class Employee {
    private String name;
    private String surname;
    private String telephoneNumber;
    private String address;
    private int ID;

    /*public Employee(String name, String surname, String telephoneNumber, String address, String ID) {
        this.name = name;
        this.surname = surname;
        this.telephoneNumber = telephoneNumber;
        this.address = address;
        this.ID = ID;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
