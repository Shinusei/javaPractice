package Practice11.task3;

import Practice11.task2.Student;
import Practice11.task2.StudentGPA;

import java.util.ArrayList;
import java.util.List;

public class StudentSort {

        public static List<Student> mergeSort(List<Student> list) {
            if (list.size() <= 1) {
                return list;
            }
            int midpoint = list.size() / 2;
            List<Student> left = mergeSort(list.subList(0, midpoint));
            List<Student> right = mergeSort(list.subList(midpoint, list.size()));
            return merge(left, right);
        }


        public static List<Student> merge(List<Student> left, List<Student> right) {
            List<Student> result = new ArrayList<>();
            int leftIndex = 0;
            int rightIndex = 0;
            while (leftIndex < left.size() && rightIndex < right.size()) {
                if (left.get(leftIndex).getGPA() > right.get(rightIndex).getGPA()) {
                    result.add(left.get(leftIndex++));
                } else {
                    result.add(right.get(rightIndex++));
                }
            }
            result.addAll(left.subList(leftIndex, left.size()));
            result.addAll(right.subList(rightIndex, right.size()));
            return result;
        }
        public static void main(String[] args) {
            Student[] students = new Student[5];
            students[0] = new Student("Alice", 5);
            students[1] = new Student("Bob", 3);
            students[2] = new Student("Charlie", 1);
            students[3] = new Student("David", 4);
            students[4] = new Student("Eve", 2);
            StudentGPA s = new StudentGPA();
            s.quick_sort(students, 0, students.length - 1);
            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i].getGPA());

            }
        }
}
