public class NotificationServices {

    public void notifyUser() throws InterruptedException {
        synchronized (this) {
            System.out.println("Trying to send user...");
            this.wait(); // Thread burada dayandırılır
            System.out.println("Sending user...");
        }
    }

    public void notifyAdmin() {
        synchronized (this) {
            System.out.println("Trying to send admin...");
            System.out.println("Sending admin...");
            this.notifyAll(); // wait edən bütün thread-ləri xəbərdar edir
        }
    }
}
