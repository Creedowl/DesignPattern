package Singleton;

public class SingletonLazy {

    private volatile static SingletonLazy instance = null;

    private int value = 0;

    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        if (instance == null) {
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }

    public int getValue() {
        return value++;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
