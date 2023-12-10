package practice15.task1;

public class StudentView {
    public void printstudentDetails(Student student) {
        System.out.println("Student: {");
        System.out.println("\tName: " + student.getName());
        System.out.println("\tRoll No: " + student.getRollNo()+"\n}");
    }
}
