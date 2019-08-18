package hello_world;

import hello_world.printer.*;

public class PrinterFactory {
    public Printer getPrinter(String printerType) {
        if (printerType == null) {
            return null;
        }

        if (printerType.equalsIgnoreCase("Whitespace")) {
            return SingletonWhitespacePrinter.getInstance().getWhitespacePrinter();
        } else if (printerType.equalsIgnoreCase("Word")) {
            return SingletonWordPrinter.getInstance().getWordPrinter();
        }

        return null;
    }
}