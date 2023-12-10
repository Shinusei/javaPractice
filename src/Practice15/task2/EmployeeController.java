package Practice15.task2;

class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public void setEmployeeSalary(int salary) {
        model.setSalary(salary);
    }

    public void setEmployeePosition(String position) {
        model.setPosition(position);
    }

    public void displayEmployeeDetails() {
        view.displayEmployeeDetails(model.getName(), model.getSalary(), model.getPosition());
    }
}
