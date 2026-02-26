import java.util.Scanner;
class positivenegative
{
    int num;
    void input() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
    }
    void check() 
    {
        if (num > 0)
            System.out.println("Positive Number");
        else if (num < 0)
            System.out.println("Negative Number");
        else
            System.out.println("Zero");
    }
    public static void main(String[] args) 
    {
        positivenegative obj = new positivenegative();
        obj.input();
        obj.check();
    }
}
