package sk.kosickaakademia.nebus.questionandanswer;

public class Chat {

    private boolean flag = false;

    public synchronized void question(String message){
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(message);
        flag = true;
        notify();
    }


    public synchronized void answer(String message){
        if(flag == false){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(message);
        flag = false;
        notify();
    }



}
