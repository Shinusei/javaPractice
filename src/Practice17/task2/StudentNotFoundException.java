package Practice17.task2;

import javax.swing.*;

public class StudentNotFoundException extends Throwable {
    public StudentNotFoundException(String fio, LabClassUI t) {
        JOptionPane.showMessageDialog(t, "Студент " + fio + " не найден");
    }
}


