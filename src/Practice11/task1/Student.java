package Practice11.task1;

public class Student {
    private final String name;
    private final int iDNumber;

    public Student(String name, int iDNumber) {
        this.name = name;
        this.iDNumber = iDNumber;
    }
    public int getiDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }
}