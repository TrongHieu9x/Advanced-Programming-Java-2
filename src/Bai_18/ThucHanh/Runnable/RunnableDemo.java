package Bai_18.ThucHanh.Runnable;

public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;

    RunnableDemo(String name){
        threadName = name;
        System.out.println("Tạo " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Chạy " + threadName);
        try {
            for (int i = 1; i < 10; i++) {
                System.out.println("Thread: " + threadName + ", " + i);
//Dừng vòng lặp 10s
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " gián đoạn.");
        }
        System.out.println("Thread " + threadName + " Thoát.");
    }

    public void start() {
        System.out.println("Bắt đầu " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
