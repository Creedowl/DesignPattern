import factories.Factory;
import products.Product;

import java.lang.reflect.InvocationTargetException;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        Factory factory = (Factory) Class.forName("factories.F2").getDeclaredConstructor().newInstance();
        Product product = factory.create();
        product.show();
    }
}
