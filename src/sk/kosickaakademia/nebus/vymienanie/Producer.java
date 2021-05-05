package sk.kosickaakademia.nebus.vymienanie;

public class Producer extends Thread{

    private Thread t;
    Number number;

    public Producer(Number number){
        this.number = number;
    }

    @Override
    public void run() {
        try {
            System.out.println("Hi, I am a producer. I am running.");
            synchronized (this){
                wait();
            }
            System.out.println("Producer is running again");
            System.out.println("And I am ready");
            number.setNumber(number.getNumber() + 9);
            System.out.println(number.getNumber());
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
