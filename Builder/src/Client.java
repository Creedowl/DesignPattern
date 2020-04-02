import builders.Builder;
import products.Product;

import java.lang.reflect.InvocationTargetException;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        Director director = new Director();
        Builder builder = (Builder) Class.forName("builders.BuilderB").getDeclaredConstructor().newInstance();
        Product product = director.construct(builder);
        System.out.println(product.toString());
    }
}
