class Factorial {
    int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }
}

public class FactorialProgram {
    public static void main(String[] args) {
        int num = 5;
        Factorial obj = new Factorial();
        System.out.println(obj.fact(num));
    }
}