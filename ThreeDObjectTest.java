import java.util.*;

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    double l, b, h;

    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    double wholeSurfaceArea() {
        return 2 * (l*b + b*h + l*h);
    }

    double volume() {
        return l * b * h;
    }
}

class Cube extends ThreeDObject {
    double a;

    Cube(double a) {
        this.a = a;
    }

    double wholeSurfaceArea() {
        return 6 * a * a;
    }

    double volume() {
        return a * a * a;
    }
}

class Cylinder extends ThreeDObject {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double wholeSurfaceArea() {
        return 2 * Math.PI * r * (r + h);
    }

    double volume() {
        return Math.PI * r * r * h;
    }
}

class Cone extends ThreeDObject {
    double r, h;

    Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double wholeSurfaceArea() {
        double l = Math.sqrt(r*r + h*h);
        return Math.PI * r * (r + l);
    }

    double volume() {
        return (Math.PI * r * r * h) / 3;
    }
}

public class ThreeDObjectTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThreeDObject obj;

        obj = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(obj.wholeSurfaceArea());
        System.out.println(obj.volume());

        obj = new Cube(sc.nextDouble());
        System.out.println(obj.wholeSurfaceArea());
        System.out.println(obj.volume());

        obj = new Cylinder(sc.nextDouble(), sc.nextDouble());
        System.out.println(obj.wholeSurfaceArea());
        System.out.println(obj.volume());

        obj = new Cone(sc.nextDouble(), sc.nextDouble());
        System.out.println(obj.wholeSurfaceArea());
        System.out.println(obj.volume());
    }
}