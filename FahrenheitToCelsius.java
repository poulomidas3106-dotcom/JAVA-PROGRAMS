import java.util.Scanner;

class FahrenheitToCelsius {
    double fahrenheit;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = sc.nextDouble();
    }

    void convert() {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius = " + celsius);
    }

    public static void main(String[] args) {
        FahrenheitToCelsius obj = new FahrenheitToCelsius();
        obj.input();
        obj.convert();
    }
}
