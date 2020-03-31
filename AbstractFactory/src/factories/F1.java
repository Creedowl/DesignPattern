package factories;

import products.PA1;
import products.PB1;
import products.ProductA;
import products.ProductB;

public class F1 implements Factory {
    @Override
    public ProductA createPA() {
        return new PA1();
    }

    @Override
    public ProductB createPB() {
        return new PB1();
    }
}
