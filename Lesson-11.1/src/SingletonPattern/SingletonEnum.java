package SingletonPattern;

public enum SingletonEnum {
    INSTANCE;

    public void doCalculation(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}