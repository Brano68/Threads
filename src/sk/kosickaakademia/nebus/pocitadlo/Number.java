package sk.kosickaakademia.nebus.pocitadlo;

public class Number {
    private boolean flag = false;
    private int number = 0;
    private int result;

    public Number(int number){
        this.number = number;
        this.result = number;
    }

    public synchronized void multiplay2(){
        while(result<500){
            if(flag){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            result *= 2;
            System.out.println("T1: "+result);
            flag = true;
            notify();
        }
    }

    public synchronized void add3(){
        while(result<500){
            if(flag == false){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            result +=3;
            System.out.println("T2: "+result);
            flag = false;
            notify();
        }
    }

}
