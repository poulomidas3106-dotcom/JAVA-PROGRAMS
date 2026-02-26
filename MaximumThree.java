import java.util.Scanner;
class MaximumThree 
{
    int a, b, c;
    void input() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    }
    void findMax() {
        int max = a;

        if (b > max)
            max = b;
        if (c > max)
            max = c;

        System.out.println("Maximum = " + max);
    }
    public static void main(String[] args) {
        MaximumThree obj = new MaximumThree();
        obj.input();
        obj.findMax();
    }
}