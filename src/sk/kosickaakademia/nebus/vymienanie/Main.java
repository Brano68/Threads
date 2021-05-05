package sk.kosickaakademia.nebus.vymienanie;

public class Main {

    public static void main(String[] args) {

        Number number = new Number();
        number.setNumber(4);

        Producer producer = new Producer(number);
        producer.start();

        Consumer consumer = new Consumer(producer, number);
        consumer.start();

        System.out.println("Main finished");
    }

}
