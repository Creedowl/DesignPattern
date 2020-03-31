import factories.Factory;
import products.ProductA;
import products.ProductB;

import java.lang.reflect.InvocationTargetException;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        Factory factory = (Factory) Class.forName("factories.F2").getDeclaredConstructor().newInstance();
        ProductA pa = factory.createPA();
        pa.show();
        ProductB pb = factory.createPB();
        pb.show();
    }
}
