public class PrinterFactory {

    public Printer getPrinter() {
        return SingletonPrinter.getInstance().getPrinter();
    }
}