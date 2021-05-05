package sk.kosickaakademia.nebus;

import sk.kosickaakademia.nebus.thread.PrimeNumber;

public class Main {

    public static void main(String[] args) {
/*
        MyThread myThread1 = new MyThread("myThread1",2);
        myThread1.start();

        MyThread myThread2 = new MyThread("myThread2",8);
        myThread2.start();

        System.out.println("Main finished");

 */
        PrimeNumber primeNumber = new PrimeNumber("primeNumber", 115628476);
        primeNumber.start();
    }

}
