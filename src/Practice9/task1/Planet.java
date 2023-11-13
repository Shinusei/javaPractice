package Practice9.task1;

public class Planet implements Nameable{
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Planet planet = new Planet("Saturn");
        System.out.println(planet.getName());
    }
}
