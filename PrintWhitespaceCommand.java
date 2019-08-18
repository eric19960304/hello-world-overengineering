public class PrintWhitespaceCommand implements PrintCommand {
    private Printable printBody;

    public PrintWhitespaceCommand(Printable printBody) {
        this.printBody = printBody;
    }

    public void execute() {
        Whitespace ws = (Whitespace) printBody;
        System.out.print(ws.getValue());
    }
}