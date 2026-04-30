import java.util.*;

class Item {
    int code;
    double price;

    void getData(Scanner sc) {
        code = sc.nextInt();
        price = sc.nextDouble();
    }

    void display() {
        System.out.println(code + "\t" + price);
    }
}

public class ItemDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item items[] = new Item[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
            items[i].getData(sc);
            total += items[i].price;
        }

        System.out.println("Code\tPrice");

        for (int i = 0; i < 5; i++) {
            items[i].display();
        }

        System.out.println("Total = " + total);
    }
}