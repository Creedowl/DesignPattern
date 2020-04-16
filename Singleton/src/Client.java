import Singleton.SingletonEager;
import Singleton.SingletonEnum;
import Singleton.SingletonInner;
import Singleton.SingletonLazy;

public class Client {
    public static void main(String[] args) {
        // lazy singleton
        System.out.println(SingletonLazy.getInstance().getValue());
        System.out.println(SingletonLazy.getInstance().getValue());

        // eager singleton
        System.out.println(SingletonEager.getInstance().getValue());
        System.out.println(SingletonEager.getInstance().getValue());

        // static inner class singleton
        System.out.println(SingletonInner.getInstance().getValue());
        System.out.println(SingletonInner.getInstance().getValue());

        // enum singleton
        System.out.println(SingletonEnum.INSTANCE.getValue());
        System.out.println(SingletonEnum.INSTANCE.getValue());
    }
}
