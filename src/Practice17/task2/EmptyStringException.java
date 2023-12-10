package Practice17.task2;

import javax.swing.*;

public class EmptyStringException extends IllegalArgumentException {
    public EmptyStringException(LabClassUI t) {
        JOptionPane.showMessageDialog(t, "Введите необходимые данные в поле ввода!");
    }
}


