package factories;

import products.P2;
import products.Product;

public class F2 implements Factory {
    @Override
    public Product create() {
        return new P2();
    }
}
