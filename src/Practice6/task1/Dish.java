package Practice6.task1;

public abstract class Dish {
    private String material;
    private int price;

    public Dish(String material, int price) {
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
    public abstract void filling(String fill);
}
