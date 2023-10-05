package Practice6.task2;

public abstract class Dog {
    private String furColor;
    private boolean friendly;

    public Dog(String furColor, boolean friendly) {
        this.furColor = furColor;
        this.friendly = friendly;
    }
    public abstract void setPlace(String place);

    @Override
    public String toString() {
        return "{" +
                "furColor='" + furColor + '\'' +
                ", friendly=" + friendly +
                '}';
    }
}
