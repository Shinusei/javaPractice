package Practice4.task2;

public class Hand {
    private String side;
    private int fingerCount;
    private boolean isBroke;

    public Hand(String side, int fingerCount, boolean isBroke) {
        this.side = side;
        this.fingerCount = fingerCount;
        this.isBroke = isBroke;
    }

    public int getFingerCount() {
        return fingerCount;
    }

    public boolean isBroke() {
        return isBroke;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setFingerCount(int fingerCount) {
        this.fingerCount = fingerCount;
    }

    public void setBroke(boolean broke) {
        isBroke = broke;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "side='" + side + '\'' +
                ", fingerCount=" + fingerCount +
                ", isBroke=" + isBroke +
                '}';
    }
}
