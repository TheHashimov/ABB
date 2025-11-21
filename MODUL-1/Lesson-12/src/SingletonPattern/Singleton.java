package SingletonPattern;

public class Singleton {

    public static final Singleton INSTANCE_STATIC = new Singleton();

    private static volatile Singleton INSTANCE_WITH_LOCK;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE_WITH_LOCK == null) {
            synchronized (Singleton.class) {
                if (INSTANCE_WITH_LOCK == null) {
                    INSTANCE_WITH_LOCK = new Singleton();
                }
            }
        }
        return INSTANCE_WITH_LOCK;
    }

    public static class Holder {
        private static final Singleton INSTANCE = new Singleton();

        public static Singleton getInstance() {
            return INSTANCE;
        }
    }

    public void doCalculation(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}