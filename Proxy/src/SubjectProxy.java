import java.lang.reflect.InvocationTargetException;

public class SubjectProxy implements Subject {
    private Subject real;

    private void preRequest() {
        System.out.println("pre request");
    }

    private void postRequest() {
        System.out.println("post request");
    }

    @Override
    public void request() {
        if (this.real == null) create();
        preRequest();
        real.request();
        postRequest();
    }

    private void create() {
        if (this.real == null) {
            try {
                real = (Subject) Class.forName("RealSubject").getDeclaredConstructor().newInstance();
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException |
                    InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
