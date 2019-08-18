package hello_world;

import hello_world.printer.*;

public class PrinterFactory {
    public enum PrinterType {
        WHITESPACE,
        WORD;
    }

    public Printer getPrinter(PrinterType printerType) {
        if (printerType == null) {
            return null;
        }

        switch (printerType) {
            case WHITESPACE:
                return SingletonWhitespacePrinter.getInstance().getWhitespacePrinter();
            case WORD:
                return SingletonWordPrinter.getInstance().getWordPrinter();
        }

        return null;
    }
}