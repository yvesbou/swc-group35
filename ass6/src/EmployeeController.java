public class EmployeeController {
    private Employee employee;
    private EmployeeView employeeView;

    public EmployeeController(Employee employee, EmployeeView employeeView) {
        this.employee = employee;
        this.employeeView = employeeView;
    }
    public static int uniqueIDGenerator(){
        int counter = 10000000;
        counter++;
        return counter;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeView getEmployeeView() {
        return employeeView;
    }

    public void setEmployeeView(EmployeeView employeeView) {
        this.employeeView = employeeView;
    }

    public void setEmployeeName(String name){
        this.employee.setName(name);
    }

    public void setEmployeeSurname(String surname){
        this.employee.setSurname(surname);
    }

    public void setEmployeeAddress(String address){
        this.employee.setAddress(address);
    }

    public void setEmployeeID(int ID){
        this.employee.setID(uniqueIDGenerator());
    }

    public void setEmployeeTelephoneNumber(String telephoneNumber){
        this.employee.setTelephoneNumber(telephoneNumber);
    }

    public void updateView(){
        employeeView.printEmployee(employee.getName(), employee.getSurname(), employee.getAddress(), employee.getTelephoneNumber(), employee.getID());
    }

    public void updateViewName(){
        employeeView.printName(employee.getName());
    }

    public void updateViewSurname(){
        employeeView.printSurname(employee.getSurname());
    }

    public void updateViewAddress(){
        employeeView.printAddress(employee.getAddress());
    }

    public void updateViewTelephoneNumber(){
        employeeView.printTelephoneNumber(employee.getTelephoneNumber());
    }

    public void updateViewID(){
        employeeView.printID(employee.getID());
    }
}
