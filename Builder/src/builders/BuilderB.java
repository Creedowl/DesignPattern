package builders;

public class BuilderB extends Builder {
    @Override
    public void buildId() {
        product.setId(1);
    }

    @Override
    public void buildName() {
        product.setName("B");
    }

    @Override
    public void buildContent() {
        product.setContent("BBB");
    }
}
