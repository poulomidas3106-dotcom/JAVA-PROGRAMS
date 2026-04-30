interface Gross {
    void calculateGross();
}

class Employee {
    String name;
    double basic;

    Employee(String n, double b) {
        name = n;
        basic = b;
    }
}

class Salary extends Employee implements Gross {
    double gross;

    Salary(String n, double b) {
        super(n, b);
    }

    public void calculateGross() {
        gross = basic + (0.2 * basic) + (0.1 * basic);
        System.out.println(gross);
    }
}

public class SalarySystem {
    public static void main(String[] args) {
        Salary s = new Salary("Ram", 10000);
        s.calculateGross();
    }
}
