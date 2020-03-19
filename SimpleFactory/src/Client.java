public class Client {
    public static void main(String[] args) {
        Product p1 = Factory.create("P1");
        assert p1 != null;
        p1.show();
        Product p2 = Factory.create("P2");
        assert p2 != null;
        p2.show();
    }
}
