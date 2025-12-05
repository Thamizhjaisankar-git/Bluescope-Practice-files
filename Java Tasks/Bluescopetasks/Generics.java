// package Bluescopetasks;

class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class Generics {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.set("Hello");
        System.out.println(b1.get());

        Box<Integer> b2 = new Box<>();
        b2.set(10);
        System.out.println(b2.get());
    }
}
