package sk.kosickaakademia.nebus.thread;

public class PrimeNumber extends Thread{

    private String threadName;
    private int base;
    private Thread t;

    public PrimeNumber(String threadName, int base){
        this.threadName = threadName;
        this.base = base;
    }

    @Override
    public void run() {
        while(true){
            int pocetDelitelov = 0;

            for(int i = 1; i <= base; i++){
                if(base%i == 0){
                    pocetDelitelov++;
                }
            }
            if(pocetDelitelov == 2){
                System.out.println("Result is: " + base);
                break;
            }
            base++;
        }
    }

    public void start(){
        if(t==null){
            t = new Thread(this, this.threadName);
            t.start();
        }
    }
}
