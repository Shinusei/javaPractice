package Practice2.task1;

public class Dolmat extends Dog {
    private String park;
    private int spotsCount;

    public Dolmat(String furColor, boolean friendly, int spotsCount) {
        super(furColor, friendly);
        this.spotsCount=spotsCount;
    }

    @Override
    public String toString() {

        return "Dolmat{" +
                "park='" + park + '\'' +
                ", spotsCount=" + spotsCount +
                '}';
    }

    @Override
    public void setPlace(String place) {
        this.park=place;
    }
}
