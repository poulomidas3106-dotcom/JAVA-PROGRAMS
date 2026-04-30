interface Bank {
    void deposit(double amt);
    void withdraw(double amt);
}

class Customer {
    String name;

    Customer(String n) {
        name = n;
    }
}

class Account extends Customer implements Bank {
    double balance = 0;

    Account(String n) {
        super(n);
    }

    public void deposit(double amt) {
        balance += amt;
        System.out.println(balance);
    }

    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
            System.out.println(balance);
        } else {
            System.out.println("Insufficient");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Account a = new Account("Ram");
        a.deposit(5000);
        a.withdraw(2000);
    }
}