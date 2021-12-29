package Bai_18.BaiTap.PrimeNumber;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazy = new LazyPrimeFactorization("Lazy");
        OptimizedPrimeFactorization optimized = new OptimizedPrimeFactorization("optimized");

        Thread thread1 = new Thread(lazy);
        Thread thread2 = new Thread(optimized);

        thread2.start();
        thread1.start();
    }
}
