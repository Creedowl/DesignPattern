public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void addedBehavior(){
        System.out.println("added behavior from concrete decorator");
    }

    public void operation(){
        super.operation();
        addedBehavior();
    }
}
