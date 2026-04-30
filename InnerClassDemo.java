class Outer {
    int x = 10;

    class Inner {
        void display() {
            System.out.println(x);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.display();
    }
}