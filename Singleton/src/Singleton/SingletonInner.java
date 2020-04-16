package Singleton;

public class SingletonInner {

    private int value = 0;

    private SingletonInner() {}

    private static class LazyHolder {
        private static final SingletonInner instance = new SingletonInner();
    }

    public static SingletonInner getInstance() {
        return LazyHolder.instance;
    }

    public int getValue() {
        return value++;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
