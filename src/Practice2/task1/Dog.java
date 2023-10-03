package Practice2.task1;

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
        return "Dog{" +
                "furColor='" + furColor + '\'' +
                ", friendly=" + friendly +
                '}';
    }
}
