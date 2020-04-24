package ClassAdapter;

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        String name = "adaptee";
        super.adapteeRequest(name);
    }
}
