public class PrintCharCommand implements PrintCommand {
    private Printable printBody;

    public PrintCharCommand(Printable printBody) {
        this.printBody = printBody;
    }

    public void execute() {
        Char ws = (Char) printBody;
        System.out.print(ws.getValue());
    }
}