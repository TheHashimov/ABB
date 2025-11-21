import java.time.LocalTime;

public class ThreadWithExtend extends Thread {
    @Override
    public void run() {
        System.out.println("RunningWithExtend metodu ile bashladi  " + LocalTime.now());
    }
}