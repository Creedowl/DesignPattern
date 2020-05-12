package Component;

public abstract class Component {
    public String getName() {
        throw new Error("unsupported");
    }

    public String getContent() {
        throw new Error("unsupported");
    }

    public void show() {
        throw new Error("unsupported");
    }

    public void add(Component component) {
        throw new Error("unsupported");
    }
}
