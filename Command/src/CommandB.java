public class CommandB implements Command {
    private final Receiver receiver;

    public CommandB(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("Command B");
        receiver.action();
    }
}
