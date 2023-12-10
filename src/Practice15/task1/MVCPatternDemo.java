package Practice15.task1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // fetch student record from database
        Student model = retrieveStudentFromDatabase();

        // create model, view, and controller
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        // update view with new data
        controller.updateView();
    }

    public static Student retrieveStudentFromDatabase() {
        // retrieve student data from the database
        // this could be replaced with a real database connection
        Student student = new Student();
        student.setName("John Doe");
        student.setRollNo("12345");
        return student;
    }
}
