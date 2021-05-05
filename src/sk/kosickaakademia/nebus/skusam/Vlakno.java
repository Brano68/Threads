package sk.kosickaakademia.nebus.skusam;

public class Vlakno extends Main implements Runnable{
    private String threadName;
    private Thread t;

    public Vlakno(String threadName){
        this.threadName = threadName;
        System.out.println("A new thread1 was created " + threadName);
    }

    @Override
    public void run() {
        //telo
        for(int i = 1; i <= 10; i++){
            System.out.println("I am " + this.threadName + " value " + i);
            result += 2;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(result);
        }

    }

    public void start(){
        System.out.println("Starting " + this.threadName);
        if(t==null){
            t = new Thread(this, this.threadName);
            t.start();
        }
    }
}
