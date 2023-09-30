package Practice4.task2;

public class Leg {
    private String side;
    private int size;
    private boolean isBroke;

    public Leg(String side, int size, boolean isBroke) {
        this.side = side;
        this.size = size;
        this.isBroke = isBroke;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isBroke() {
        return isBroke;
    }

    public void setBroke(boolean broke) {
        isBroke = broke;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "side='" + side + '\'' +
                ", size=" + size +
                ", isBroke=" + isBroke +
                '}';
    }
}
