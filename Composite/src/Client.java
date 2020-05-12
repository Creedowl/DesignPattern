import Component.Container;
import Component.Item;

public class Client {
    public static void main(String[] args) {
        Container container = new Container("Container");
        Item item1 = new Item("item1", "c1");
        Item item2 = new Item("item2", "c2");
        Item item3 = new Item("item3", "c3");
        container.add(item1);
        container.add(item2);
        container.add(item3);
        container.show();
    }
}
