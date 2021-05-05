package sk.kosickaakademia.nebus.skusam;

public class Main {

    public static int result = 5;

    public static void main(String[] args) {
        Vlakno vlakno = new Vlakno("Vlakno1");
        vlakno.start();

        System.out.println("Main finished");
    }
}
