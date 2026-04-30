class Overload {
    Overload() {
        System.out.println("Default");
    }

    Overload(int x) {
        System.out.println(x);
    }

    Overload(int x, int y) {
        System.out.println(x + y);
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        new Overload();
        new Overload(5);
        new Overload(5, 10);
    }
}