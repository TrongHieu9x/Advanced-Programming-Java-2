package Bai_20.ThucHanh.ObjectPool;

public class TaxiNotFoundExeption extends RuntimeException {

    public TaxiNotFoundExeption(String message) {
        System.out.println(message);
    }
}
