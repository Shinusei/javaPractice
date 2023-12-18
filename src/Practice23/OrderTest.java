package Practice23;

public class OrderTest {
    public static void main(String[] args) {
        InternetOrder internetOrder1 = new InternetOrder();
        internetOrder1.add(new Dish(40, "Beer", "Alcohol"));
        internetOrder1.add(new Dish(100, "Steak", "Cow"));
        internetOrder1.add(new Drink(10, "Juice", "Apple"));
        internetOrder1.testPrint();

        internetOrder1.removeAll("Steak");
        System.out.println("[Clearing]");
        internetOrder1.testPrint();

        System.out.println("[Ordered items]]");
        for (Item i : internetOrder1.getItems())
            System.out.println(i.getName());

        System.out.println("Cost: " + internetOrder1.costTotal());

        System.out.println("[Ordered items with cost]");
        for (Item i : internetOrder1.sortedItemsByCost())
            System.out.println(i.getName() + ", cost = " + i.getCost());

        System.out.println("[Orders]");
        TablesOrderManager t = new TablesOrderManager();
        InternetOrder order2 = new InternetOrder();
        order2.add(new Dish(50, "Icecream", "desert"));

        t.add(internetOrder1, 1);
        t.add(order2, 1);
        t.add(order2, 2);
        for (InternetOrder i : t.getOrders())
            System.out.println("Cost: " + i.costTotal());
        System.out.println("Cost for table 1: " + t.getOrder(1).costTotal());
        t.addDish(new Drink(200, "Wine", "Alcohol"), 2);
        System.out.println("Cost for table 2: " + t.getOrder(2).costTotal());
        t.removeOrder(1);
        System.out.println("[Orders]");
        for (InternetOrder i : t.getOrders())
            System.out.println("Cost: " + i.costTotal());
        System.out.println("Free tables: " + t.freeTableNumber());
        t.removeOrder(2);
        System.out.println("Free tables");
        for (int i : t.freeTableNumbers())
            System.out.print(i + " ");
        System.out.println();
        InternetOrder order3 = new InternetOrder();
        order3.add(new Dish(250, "Soup", "fish"));
        order3.add(new Drink(150, "Soup", "chicken"));
        InternetOrder order4 = new InternetOrder();
        order4.add(new Drink(15, "Juice", "Orange"));

        t.add(order3, 3);
        t.add(order4, 5);

        System.out.println("[Orders]");
        for (InternetOrder i : t.getOrders())
            System.out.println("Cost: " + i.costTotal());
        System.out.println("Total Sum: " + t.ordersCostSummary());

    }
}