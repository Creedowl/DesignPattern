import Abstraction.*;
import Implementor.*;

public class Client {
    public static void main(String[] args) {
        Abstraction a1 = new A1(new ConcreteImplementorA());
        a1.test();
        Abstraction a2 = new A2(new ConcreteImplementorB());
        a2.test();
    }
}
