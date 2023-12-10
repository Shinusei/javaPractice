package practice15.task2;

public class Main {
    public static void main(String[] args) {
        Employee model = new Employee("", 0, "");
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.setEmployeeName("John Doe");
        controller.setEmployeeSalary(50000);
        controller.setEmployeePosition("Software Engineer");

        controller.displayEmployeeDetails();
    }
}
