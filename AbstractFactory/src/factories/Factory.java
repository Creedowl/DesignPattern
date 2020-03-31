package factories;

import products.ProductA;
import products.ProductB;

public interface Factory {
    ProductA createPA();
    ProductB createPB();
}
