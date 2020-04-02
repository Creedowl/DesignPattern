package builders;

import products.Product;

public class BuilderA extends Builder {
    @Override
    public void buildId() {
        product.setId(0);
    }

    @Override
    public void buildName() {
        product.setName("A");
    }

    @Override
    public void buildContent() {
        product.setContent("AAA");
    }
}
