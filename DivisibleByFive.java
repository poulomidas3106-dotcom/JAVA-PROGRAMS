import java.util.Scanner;
class DivisibleByFive 
{
    int num;
    void input() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = sc.nextInt();
    }
    void check() 
    {
        if (num % 5 == 0)
            System.out.println("Divisible by 5");
        else
            System.out.println("Not Divisible by 5");
    }
    public static void main(String[] args) {
        DivisibleByFive obj = new DivisibleByFive();
        obj.input();
        obj.check();
    }
}