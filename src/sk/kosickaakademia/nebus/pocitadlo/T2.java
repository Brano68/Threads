package sk.kosickaakademia.nebus.pocitadlo;

public class T2 implements Runnable{

    Number number;
    Thread t;

    public T2(Number number){
        this.number = number;
        t = new Thread(this, "Vlakno2");
        t.start();
    }

    @Override
    public void run() {
        number.add3();
    }


}
