package Bai_18.BaiTap.DisplayNumber;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running...");

        OddThread oddThread = new OddThread();
        Thread number = new Thread(oddThread);
        number.start();

        System.out.println("main thread stopped!!!!");
    }
}
