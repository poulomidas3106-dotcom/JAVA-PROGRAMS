import java.util.Scanner;

class AddTwoNumbers {
    int a, b;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
    }

    void add() {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        AddTwoNumbers obj = new AddTwoNumbers();
        obj.input();
        obj.add();
    }
}
