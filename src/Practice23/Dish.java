package Practice23;

public final class Dish implements Item{
    private int cost;
    private String name;
    private String description;
    public static final int DEFAULT_COST = 0;
    public Dish(String name, String description) {
        this(DEFAULT_COST, name, description);
    }

    public Dish(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
