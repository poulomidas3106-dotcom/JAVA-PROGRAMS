import java.util.Scanner;

class LeapYear {
    int year;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        year = sc.nextInt();
    }

    void check() {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }

    public static void main(String[] args) {
        LeapYear obj = new LeapYear();
        obj.input();
        obj.check();
    }
}