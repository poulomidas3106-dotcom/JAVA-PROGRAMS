class Param {
    int x;

    Param(int a) {
        x = a;
        System.out.println(x);
    }
}

public class ParameterizedConstructorDemo {
    public static void main(String[] args) {
        Param obj = new Param(10);
    }
}