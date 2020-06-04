public class Main {
    public static void main(String[] args) {
        FileCreate fileCreate=new FileCreate();

        Thread thread1 = new Thread()
        {
            @Override
            public void run() {
                fileCreate.read();
            }
        };
        Thread thread2 = new Thread()
        {
            @Override
            public void run() {
                fileCreate.write();
            }
        };
        thread1.start();
        thread2.start();
    }
}
