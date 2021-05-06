package sk.kosickaakademia.nebus.questionandanswer;

public class T1 implements Runnable{

    private Chat chat;
    private Thread t;
    private String[] s1 = new String[]{"Hi", "How are you doing?", "What are you doing?", "Bye"};


    public T1(Chat chat){
        this.chat = chat;
        t = new Thread(this, "Question");
        t.start();
    }



    @Override
    public void run() {
        for(int i = 0; i < s1.length; i++){
            chat.question(s1[i]);
        }
    }


}
