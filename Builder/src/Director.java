import builders.Builder;
import products.Product;

public class Director {
    public Product construct(Builder builder) {
        builder.buildId();
        builder.buildName();
        builder.buildContent();
        return builder.getProduct();
    }
}
