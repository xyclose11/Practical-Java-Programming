package multithreading;

public class MultiThreading extends Thread{
    String message;
    MultiThreading ( String message ) { this.message = message; };
    public void run() {
        System.out.println( message );
    }
    public static void main(String[] args) {
        MultiThreading ht1 = new MultiThreading("Thread 1");
        MultiThreading ht2 = new MultiThreading("Thread 2");
        MultiThreading ht3 = new MultiThreading("Thread 3");
        ht1.start();
        ht2.start();
        ht3.start();
    }
}
