public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product prototype = new Product("prototype", "type1");
        System.out.println(prototype);
        Product p1 = prototype.clone();
        p1.setName("p1");
        System.out.println(p1.toString());
        Product p2 = prototype.clone();
        p2.setName("p2");
        p2.setType("type2");
        System.out.println(p2.toString());
    }
}
