class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
    }

    void displayBalance() {
        System.out.println(accountNumber + " " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String acc, double bal, double rate) {
        super(acc, bal);
        interestRate = rate;
    }

    void addInterest() {
        balance += balance * interestRate / 100;
    }
}

class FixedDepositAccount extends SavingsAccount {
    int maturityPeriod;

    FixedDepositAccount(String acc, double bal, double rate, int m) {
        super(acc, bal, rate);
        maturityPeriod = m;
    }

    void calculateMaturityAmount() {
        double amount = balance;
        for (int i = 0; i < maturityPeriod; i++)
            amount += amount * interestRate / 100;
        System.out.println(amount);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        FixedDepositAccount f = new FixedDepositAccount("123", 10000, 5, 2);
        f.deposit(2000);
        f.addInterest();
        f.calculateMaturityAmount();
        f.displayBalance();
    }
}