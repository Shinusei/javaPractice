package practice15.task2;

class EmployeeView {
    public void displayEmployeeDetails(String name, int salary, String position) {
        System.out.println("Employee: {");
        System.out.println("\tName: " + name);
        System.out.println("\tSalary: " + salary);
        System.out.println("\tPosition: " + position+"\n}");
    }
}