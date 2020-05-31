public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command commandA = new CommandA(receiver);
        Invoker invoker = new Invoker(commandA);
        invoker.action();

        Command commandB = new CommandB(receiver);
        invoker.setCommand(commandB);
        invoker.action();
    }
}
