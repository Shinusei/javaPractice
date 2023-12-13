package Practice11.task1;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Alice", 5);
        students[1] = new Student("Bob", 3);
        students[2] = new Student("Charlie", 1);
        students[3] = new Student("David", 4);
        students[4] = new Student("Eve", 2);

        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getiDNumber() > current.getiDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = current;
        }

        for (Student student : students) {
            System.out.println(student.getName()+": "+student.getiDNumber());
        }
    }
}