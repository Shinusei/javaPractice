package Practice6.task2;

public class Sherpherd extends Dog{
    private String trainingPalace;
    public Sherpherd(String furColor, boolean friendly) {
        super(furColor, friendly);
    }

    @Override
    public void setPlace(String place) {
        this.trainingPalace=place;
    }

    @Override
    public String toString() {
        return "Sherpherd{" +
                "trainingPalace='" + trainingPalace + '\'' +
                '}'+super.toString();
    }
}
