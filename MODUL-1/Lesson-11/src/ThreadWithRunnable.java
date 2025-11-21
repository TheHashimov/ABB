import java.time.LocalTime;

public class ThreadWithRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("RunningWithRunnable metodu ile bashladi  " + LocalTime.now());
    }
}
