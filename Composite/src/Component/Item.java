package Component;

public class Item extends Component {
    private String name;

    private String content;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public void show() {
        System.out.println(this.getName());
    }

    public Item(String name, String content) {
        this.name = name;
        this.content = content;
    }
}
