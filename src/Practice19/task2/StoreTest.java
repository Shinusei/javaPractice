package Practice19.task2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class StoreTest {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        StoreAny<Integer> storeInt = new StoreAny<>(integers);
        List<Integer> list = storeInt.toList();
        System.out.println(list);
        System.out.println(storeInt.getElementByIndex(3));
        String[] str = {"q","w","e"};
        StoreAny<String> storeStr = new StoreAny<>(str);
        List<String> list1 = storeStr.toList();
        System.out.println(list1);
        System.out.println(storeStr.getElementByIndex(3));
    }
}
