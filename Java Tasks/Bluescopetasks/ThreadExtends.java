package Bluescopetasks;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running...");
    }
}

public class ThreadExtends {
    public static void main(String[] args) {
        new MyThread().start();
    }
}
