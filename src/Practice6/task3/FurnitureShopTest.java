package Practice6.task3;

public class FurnitureShopTest {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(1);
        shop.add(new Table(
                "Металлический стол", 2, 1.3, 2, 2, 5930, "Металл+стекло", 0
        ));
        System.out.println(shop.getPrices());
        System.out.println("Куплено: "+ shop.buy(1));
        System.out.println(shop.getPrices());
    }
}
