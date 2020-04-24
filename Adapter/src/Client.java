public class Client {
    public static void main(String[] args) {
        // class adapter
        ClassAdapter.Target classTarget = new ClassAdapter.Adapter();
        classTarget.request();

        // object adapter
        ObjectAdapter.Adaptee objectAdaptee = new ObjectAdapter.Adaptee();
        ObjectAdapter.Target objectTarget = new ObjectAdapter.Adapter(objectAdaptee);
        objectTarget.request();
    }
}
