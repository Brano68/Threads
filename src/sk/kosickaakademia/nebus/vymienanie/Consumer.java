package sk.kosickaakademia.nebus.vymienanie;
//dobra stranka https://www.javatpoint.com/java-thread-notify-method
public class Consumer extends Thread{

    Producer producer;

    private Thread t;

    Number number;

    public Consumer(Producer producer, Number number)
    {

        this.producer = producer;
        this.number = number;
    }



    @Override
    public void run() {

        try {
            System.out.println("Hi I am a Consumer. I am running");
            number.setNumber(number.getNumber()+ 2);
            System.out.println(number.getNumber());
            Thread.sleep(3000);
            System.out.println("Customer: I am up");

            synchronized (this.producer){
                this.producer.notify();
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
