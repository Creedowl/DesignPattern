package factories;

import products.PA2;
import products.PB2;
import products.ProductA;
import products.ProductB;

public class F2 implements Factory {
    @Override
    public ProductA createPA() {
        return new PA2();
    }

    @Override
    public ProductB createPB() {
        return new PB2();
    }
}
