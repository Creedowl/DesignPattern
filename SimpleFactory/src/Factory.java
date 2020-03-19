public class Factory {
    public static Product create(String type) {
        switch (type) {
            case "P1":
                return new P1();
            case "P2":
                return new P2();
            default:
                System.out.println("unknown type");
                return null;
        }
    }
}
