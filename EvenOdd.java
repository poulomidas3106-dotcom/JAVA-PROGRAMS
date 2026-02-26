import java.util.Scanner;

class EvenOdd {
    int num;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
    }

    void check() {
        if (num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        obj.input();
        obj.check();
    }
}