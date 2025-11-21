package SingletonPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practice {
    public static void main(String[] args) {

        Singleton.INSTANCE_STATIC.doCalculation(10, 2);

        try (ExecutorService executor = Executors.newFixedThreadPool(50)) {
            for (int i = 0; i < 10; i++) {
                executor.execute(() -> {
                    SingletonEnum instance = SingletonEnum.INSTANCE;
                    System.out.println(instance.hashCode());
                });
            }
        }
    }
}