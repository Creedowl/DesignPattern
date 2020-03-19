package factories;

import products.P1;
import products.Product;

public class F1 implements Factory {
    @Override
    public Product create() {
        return new P1();
    }
}
