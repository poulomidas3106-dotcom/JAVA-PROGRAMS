import java.util.Scanner;

class ReverseNumber {
    int num;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = sc.nextInt();
    }

    void reverse() {
        int temp = num;
        int rev = 0;

        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        System.out.println("Reversed Number = " + rev);
    }

    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber();
        obj.input();
        obj.reverse();
    }
}