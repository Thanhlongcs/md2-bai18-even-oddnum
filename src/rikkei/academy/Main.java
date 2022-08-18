package rikkei.academy;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        Thread odd = new Thread(oddThread);
        Thread even = new Thread(evenThread);
        odd.start();
        odd.join();
        even.start();
    }
}