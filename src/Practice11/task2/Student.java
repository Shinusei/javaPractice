package Practice11.task2;


public class Student {
    private final String name;
    private final int GPA;

    public Student(String name, int GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public int getGPA() {
        return GPA;
    }

}