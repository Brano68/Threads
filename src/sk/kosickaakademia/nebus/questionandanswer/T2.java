package sk.kosickaakademia.nebus.questionandanswer;

public class T2 implements Runnable {

    private Chat chat;
    private Thread t;
    private String[] s2 = new String[]{"Hi", "I am good.", "I am swimming.", "Bye"};


    public T2(Chat chat) {
        this.chat = chat;
        t = new Thread(this, "Answer");
        t.start();
    }


    @Override
    public void run() {
        for (int i = 0; i < s2.length; i++) {
            chat.answer(s2[i]);
        }
    }

}
