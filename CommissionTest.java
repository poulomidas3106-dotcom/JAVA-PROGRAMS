import java.util.*;

class Commission {
    double sales;

    Commission(double s) {
        sales = s;
    }

    double commission() {
        if (sales >= 10000)
            return sales * 0.1;
        else if (sales >= 5000)
            return sales * 0.05;
        else
            return sales * 0.02;
    }
}

public class CommissionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();

        if (s < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission c = new Commission(s);
            System.out.println(c.commission());
        }
    }
}