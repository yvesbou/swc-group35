public class MVCPatternDemo {

    public static Employee retrieveEmployeeFromDatabase(){
        Employee employee = new Employee();
        employee.setID(EmployeeController.uniqueIDGenerator());
        return employee;}

    public static void main(String[] args){

        Employee employee1 = retrieveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(employee1, view);
        controller.setEmployeeName("Vincent");
        controller.setEmployeeSurname("Müller");
        controller.setEmployeeAddress("Zürcherstrasse 42");
        controller.setEmployeeTelephoneNumber("0774277790");

        controller.updateView();

        controller.setEmployeeAddress("NewStreet10");
        controller.updateViewAddress();

        controller.setEmployeeTelephoneNumber("0799068896");
        controller.updateViewTelephoneNumber();
    }
}
