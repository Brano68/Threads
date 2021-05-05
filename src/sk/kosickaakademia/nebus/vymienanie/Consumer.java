package sk.kosickaakademia.nebus.vymienanie;

public class Consumer extends Thread{

    private Thread t;



    @Override
    public void run() {

        try {
            System.out.println("Hi I am a Consumer. I am running");
            Thread.sleep(3000);
            System.out.println("I am up");
            synchronized (this){
                notify();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public synchronized void start() {
        if(t==null){
            t = new Thread(this, "Consumer");
            t.start();
        }
    }

}
