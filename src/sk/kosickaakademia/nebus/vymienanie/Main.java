package sk.kosickaakademia.nebus.vymienanie;

public class Main {

    public static void main(String[] args) {

        Producer producer = new Producer();
        producer.start();

        Consumer consumer = new Consumer();
        consumer.start();

        System.out.println("Main finished");
    }

}
