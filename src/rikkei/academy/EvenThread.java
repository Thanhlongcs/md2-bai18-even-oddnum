package rikkei.academy;

public class EvenThread implements Runnable {
    public void run() {
        for (int i = 0; i <= 10 ; i+=2) {
            try {
                System.out.println("EvenThread " + i);
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
