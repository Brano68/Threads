package sk.kosickaakademia.nebus.vymienanie;

public class Producer extends Thread{

    private Thread t;

    @Override
    public void run() {
        try {
            System.out.println("Hi, I am a producer. I am running.");
            synchronized (this){
                wait();
            }
            System.out.println("Producer is running again");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public synchronized void start() {
        if(t == null){
            t = new Thread(this, "producer");
            t.start();
        }
    }



}
