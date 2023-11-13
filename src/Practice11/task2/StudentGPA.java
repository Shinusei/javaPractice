package Practice11.task2;

import java.util.Comparator;

public class StudentGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student1.getGPA(),student2.getGPA());
    }

    public void quick_sort(Student arr[], int begin, int end) {
        if (begin < end) {
            int partIndex = part(arr, begin, end);
            quick_sort(arr, begin, partIndex-1);
            quick_sort(arr, partIndex+1, end);
        }
    }
    public int part(Student arr[], int begin, int end) {
        Student pt = arr[end];
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (compare(arr[j], pt) >= 0) {
                i++;
                Student swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        Student swapt = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapt;
        return i + 1;
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Alice", 5);
        students[1] = new Student("Bob", 3);
        students[2] = new Student("Charlie", 1);
        students[3] = new Student("David", 4);
        students[4] = new Student("Eve", 2);
        StudentGPA s = new StudentGPA();
        s.quick_sort(students,0, students.length - 1);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getGPA());

        }
    }
}

