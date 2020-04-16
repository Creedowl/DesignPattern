package Singleton;

public enum SingletonEnum {

    INSTANCE;

    private int value = 0;

    public int getValue() {
        return value++;
    }

    public void setValue(int value) {
        this.value = value;
    }
}