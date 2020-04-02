package builders;

import products.Product;

public abstract class Builder {
    protected Product product = new Product();

    public abstract void buildId();

    public abstract void buildName();

    public abstract void buildContent();

    public Product getProduct() {
        return product;
    }
}
