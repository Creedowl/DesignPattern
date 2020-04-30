package Abstraction;

import Implementor.Implementor;

public class A1 extends Abstraction {
    public A1(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void test() {
        implementor.show();
        System.out.println("A1");
    }
}
