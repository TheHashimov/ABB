import java.time.LocalTime;

public class Praktika {

    public static void main(String[] args) {

        NotificationServices service = new NotificationServices();

        Thread userThread = new Thread(() -> {
            try {
                service.notifyUser();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "UserThread");

        Thread adminThread = new Thread(() -> service.notifyAdmin(), "AdminThread");

        userThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        adminThread.start();
    }
}
