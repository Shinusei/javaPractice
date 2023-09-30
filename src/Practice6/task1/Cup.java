package Practice6.task1;

public class Cup extends Dish{
    private String type;
    private String size;
    private String drink;
    public Cup(String material, int price, String type, String size) {
        super(material, price);
        this.type=type;
        this.size=size;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }

    @Override
    public void filling(String fill) {
        this.drink=fill;
    }

}
