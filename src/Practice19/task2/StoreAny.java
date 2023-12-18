package Practice19.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreAny <T>{
    private T[] array;

    public StoreAny (T[] array) {
        this.array = array;
    }

    public List<T> toList() {
        return new ArrayList<>(Arrays.asList(array));
    }
    public T getElementByIndex(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IllegalArgumentException("Index out of range");
        }
    }
}
