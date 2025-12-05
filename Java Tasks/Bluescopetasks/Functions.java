package Bluescopetasks;

public class Functions {
    void greet(String name) {
        System.out.println("Hello" + "name" + "!");
    }

    int multiply(int a, int b) {
        return a * b;
    }

    void test() {
        int x = 10;
        System.out.println("Local scope variable value is: " + x);
    }

    public static void main(String[] args) {
        Functions f = new Functions();
        f.greet("Chen");
        System.out.println(f.multiply(10, 20));
        f.test();
    }
}
