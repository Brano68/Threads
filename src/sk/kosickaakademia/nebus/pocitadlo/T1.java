package sk.kosickaakademia.nebus.pocitadlo;

public class T1 implements Runnable{

    Number number;
    Thread t;

    public T1(Number number){
        this.number = number;
        t = new Thread(this, "Vlakno1");
        t.start();
    }

    @Override
    public void run() {
        number.multiplay2();
    }

}
