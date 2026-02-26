import java.util.Scanner;

class PrintingName {
    String name;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
    }

    void display() {
        System.out.println("Your Name is: " + name);
    }

    public static void main(String[] args) {
        PrintingName obj = new PrintingName();
        obj.input();
        obj.display();
    }
}