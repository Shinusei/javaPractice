package Practice9.task2;

public class PC implements Priceable{
    private int price;
    @Override
    public int getPrice() {
        return price;
    }
    public PC(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        PC pc = new PC(10000);
        System.out.println(pc.getPrice());
    }
}
