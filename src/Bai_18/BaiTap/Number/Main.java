package Bai_18.BaiTap.Number;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running... ");

        NumberGenerator numberGenerator1 = new NumberGenerator();
        Thread number = new Thread(numberGenerator1);
        number.start();

        System.out.println("Main thread stopped!!! ");
    }
}
