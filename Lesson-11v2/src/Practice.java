import java.util.ArrayList;
import java.util.List;

public class Practice {

    public static void main(String[] args) throws InterruptedException {

        List<PizzaOrder> orders = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            PizzaOrder order = new PizzaOrder(i);
            orders.add(order);
            order.start();
        }

        for (PizzaOrder order : orders) {
            order.join();
        }

        PizzaOrder fastest = orders.get(0);
        for (PizzaOrder order : orders) {
            if (order.getTotalTime() < fastest.getTotalTime()) {
                fastest = order;
            }
        }

        int totalSimulationTime = orders.stream()
                .mapToInt(PizzaOrder::getTotalTime)
                .max()
                .orElse(0);

        System.out.println("=======================================");
        System.out.println("All orders completed!");
        System.out.println("Total simulation time: " + totalSimulationTime + " seconds");
        System.out.println("Fastest order: " + fastest.getName() + " → " + fastest.getTotalTime() + " sec");
        System.out.println("=======================================");
    }
}