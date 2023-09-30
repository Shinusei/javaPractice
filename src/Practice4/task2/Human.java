package Practice4.task2;

public class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;
    public Human(int fingerR, int fingerL, boolean brokenHR, boolean brokenHL,
                 String colorH, String colorE,
                 int size, boolean brokenLR, boolean brokenLL)
    {
        this.rightHand = new Hand("right",fingerR,brokenHR);
        this.leftHand = new Hand("left",fingerL,brokenHL);
        this.head = new Head(colorH,colorE);
        this.rightLeg = new Leg("right",size,brokenLR);
        this.leftLeg = new Leg("left",size,brokenLL);
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", leftLeg=" + leftLeg +
                ", rightLeg=" + rightLeg +
                ", leftHand=" + leftHand +
                ", rightHand=" + rightHand +
                '}';
    }
}
