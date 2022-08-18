package rikkei.academy;

public class OddThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 10 ; i+=2) {
            try {
                System.out.println("OddThread " + i);
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

