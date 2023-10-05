package Practice6.task1;

public class Plate extends Dish{

    private int radius;
    private String meal;

    public Plate(String material, int price, int radius) {
        super(material, price);
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "radius=" + radius +
                ", meal='" + meal + '\'' +
                '}'+super.toString();
    }

    @Override
    public void filling(String fill) {
        this.meal=fill;
    }
}
