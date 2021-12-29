package Bai_18.BaiTap.PrimeNumber;

public class LazyPrimeFactorization implements Runnable {
    private final Thread myThread;

    public LazyPrimeFactorization(String name) {
        myThread = new Thread(this, name);
        System.out.println("my thread created" + name);
    }

    @Override
    public void run() {
        int number = 2;
        int countPrime = 200;
        while (number < countPrime) {
            boolean flag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(number + " " + myThread.getName() + "\n");
            }
            number++;
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
