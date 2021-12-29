package Bai_18.BaiTap.PrimeNumber;

public class OptimizedPrimeFactorization implements Runnable {
    private final Thread myThread;

    public  OptimizedPrimeFactorization(String name) {
        myThread = new Thread(this, name);
        System.out.println("my thread created" + name);
    }

    @Override
    public void run() {
        int number = 2;
        int countPrimes = 200;

        while (number < countPrimes) {
            boolean flag = true;
            for (int i = 0; i <= Math.sqrt(number); i++) {
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
