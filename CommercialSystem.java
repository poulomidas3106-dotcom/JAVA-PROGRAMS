interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {
    public void processSale(double amount) {
        System.out.println(amount);
    }

    public void generateInvoice(String clientName, double amount) {
        System.out.println(clientName + " " + amount);
    }

    void showSummary() {
        System.out.println("Completed");
    }
}

public class CommercialSystem {
    public static void main(String[] args) {
        CommercialExecutive c = new CommercialExecutive();
        c.processSale(10000);
        c.generateInvoice("ABC", 10000);
        c.showSummary();
    }
}