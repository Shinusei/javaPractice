package Practice19.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert {
    public static void main(String[] args) {
        List<String> list1 = arrayToList(new String[]{"Java", "Python", "C++"});
        System.out.println(list1);

        List<Integer> list2 = arrayToList(new Integer[]{1, 2, 3, 4, 5});
        System.out.println(list2);
    }

    public static <T> List<T> arrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
