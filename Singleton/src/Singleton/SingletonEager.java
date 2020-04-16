package Singleton;

public class SingletonEager {

    private static final SingletonEager instance = new SingletonEager();

    private int value = 0;

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return instance;
    }

    public int getValue() {
        return value++;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
