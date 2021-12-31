package Bai_20.ThucHanh.ObjectPool;

public class ObjectPoolDemo {
    public static final int NUM_OF_ClIENT = 8;

    public static void main(String[] args) {
        TaxiPool taxiPool = new TaxiPool();
        for (int i = 1; i < NUM_OF_ClIENT; i++) {
            Runnable client = new TaxiThread(taxiPool);
            Thread thread = new Thread(client);
            thread.start();
        }
    }
}
