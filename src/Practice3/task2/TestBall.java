package Practice3.task2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ball ball = new Ball(4, 7);
        System.out.println(ball);
        System.out.print("new cords: ");
        ball.move(scanner.nextInt(), scanner.nextInt());
        System.out.println(ball);
    }
}
