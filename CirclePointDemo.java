import java.util.*;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    Point p;
    double radius;

    Circle(int x, int y, double r) {
        p = new Point(x, y);
        radius = r;
    }

    void display() {
        System.out.println("Center: (" + p.x + "," + p.y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (Math.PI * radius * radius));
    }
}

public class CirclePointDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        double r = sc.nextDouble();

        Circle c = new Circle(x, y, r);
        c.display();
    }
}