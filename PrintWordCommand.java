public class PrintWordCommand implements PrintCommand {
    private Printable printBody;

    public PrintWordCommand(Printable printBody) {
        this.printBody = printBody;
    }

    public void execute() {
        Word w = (Word) printBody;
        System.out.print(w.getValue());
    }
}