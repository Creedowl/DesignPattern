package Component;

import java.util.ArrayList;
import java.util.List;

public class Container extends Component {
    private String name;

    private ArrayList<Component> componentList = new ArrayList<Component>();

    public Container(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void add(Component component) {
        this.componentList.add(component);
    }

    @Override
    public void show() {
        System.out.println(this.getName());
        for (Component component : this.componentList) {
            component.show();
        }
    }
}
