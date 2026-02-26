import java.util.Scanner;

class SwapNumbers {
    int num;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = sc.nextInt();
    }

    void swap(SwapNumbers obj2) {
        int temp = this.num;
        this.num = obj2.num;
        obj2.num = temp;
    }

    void display() {
        System.out.println("Number = " + num);
    }

    public static void main(String[] args) {
        SwapNumbers obj1 = new SwapNumbers();
        SwapNumbers obj2 = new SwapNumbers();

        System.out.println("Enter first number:");
        obj1.input();

        System.out.println("Enter second number:");
        obj2.input();

        obj1.swap(obj2);

        System.out.println("After Swapping:");
        obj1.display();
        obj2.display();
    }
}