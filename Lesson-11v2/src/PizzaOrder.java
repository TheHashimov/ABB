import java.util.Random;

public class PizzaOrder extends Thread {

    private static final Object lock = System.out; // synchronized output
    private static final Random random = new Random();

    private final int orderId;
    private int totalTime;

    public PizzaOrder(int orderId) {
        this.orderId = orderId;
        this.setName("Order-" + orderId);
    }

    public int getTotalTime() {
        return totalTime;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        log("[Started]");
        log("[Preparing pizza...]");
        sleepRandom(1, 3);

        log("[Preparation complete]");
        log("[Baking pizza...]");
        sleepRandom(3, 6);

        log("[Baking complete]");
        log("[Delivering pizza to customer...]");
        sleepRandom(2, 5);

        totalTime = (int) ((System.currentTimeMillis() - startTime) / 1000);

        log("[Pizza delivered!]");
        log("[Total time: " + totalTime + " seconds]\n");
    }

    private void sleepRandom(int minSec, int maxSec) {
        try {
            Thread.sleep((minSec + random.nextInt(maxSec - minSec + 1)) * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void log(String message) {
        synchronized (lock) {
            System.out.println("[" + getName() + "] " + message);
        }
    }
}
