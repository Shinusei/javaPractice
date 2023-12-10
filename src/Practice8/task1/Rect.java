package Practice8.task1;
import java.awt.*;
public class Rect extends Shape{
    Rect (int position) {
        this.position = position;
    }
    public void paint(Graphics g){
        g.setColor(new Color(getBackground_color()[0],getBackground_color()[1],getBackground_color()[2]));
        g.fillRect(getWidth() / 2, getHeight()/2, 30, 30);
    }
}
