package Abstraction;

import Implementor.Implementor;

public class A2 extends Abstraction {
    public A2(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void test() {
        implementor.show();
        System.out.println("A2");
    }
}
