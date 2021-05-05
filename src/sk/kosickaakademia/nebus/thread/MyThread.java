package sk.kosickaakademia.nebus.thread;

public class MyThread implements Runnable{

    private String threadName;
    private Thread t;
    private int priority;

    public MyThread(String threadName, int priority){
        this.threadName = threadName;
        this.priority = priority;
        System.out.println("A new thread was created " + threadName);
    }

    @Override
    public void run() {
        //zaciatok
        System.out.println("Running " + this.threadName);

        //telo
        for(int i = 1; i <= 10; i++){
            System.out.println("I am " + this.threadName + " value " + i);
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //koniec
        System.out.println("Thread " + this.threadName + " has just finished");
    }

    public void start(){
        System.out.println("Starting " + this.threadName);
        if(t==null){
            t = new Thread(this, this.threadName);
            t.setPriority(priority);
            t.start();
        }
    }



}
