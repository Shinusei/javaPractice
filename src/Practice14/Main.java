package Practice14;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bounded");
        BoundedWaitList<String> waitList = new BoundedWaitList<>(5);
        for (int i=0;i<6;i++){
            waitList.add("Item"+i);
        }
        System.out.println("Removed item: " + waitList.remove());
        System.out.println("Contains 'Item4': " + waitList.contains("Item4"));
        System.out.println("Current wait list: " + waitList);
        System.out.println("Unfair");

        UnfairWaitList<String> waitList1 = new UnfairWaitList<>();
        for (int i=0;i<6;i++){
            waitList1.add("Item"+i);
        }
        System.out.println("Removed item: " + waitList1.remove());
        waitList1.moveToBack("Item2");
        System.out.println("Current wait list: " + waitList1);
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Item2", "Item7"));
        System.out.println("Contains Items 2&7: "+waitList1.containsAll(list));
    }
}
