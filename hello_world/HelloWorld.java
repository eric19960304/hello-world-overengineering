package hello_world;
import hello_world.printable.*;
import hello_world.printer.*;

public class HelloWorld {

    public static void main(String[] args) throws Exception {
        Printable hello = new Word("Hello");
        Printable comma = new Comma();
        Printable space = new Space();
        Printable world = new Word("World");
        Printable newline = new Newline();

        PrinterFactory factory = new PrinterFactory();
        Printer whitespacePrinter = factory.getPrinter(PrinterFactory.PrinterType.WHITESPACE);
        Printer wordPrinter = factory.getPrinter(PrinterFactory.PrinterType.WORD);

        wordPrinter.print(hello);
        whitespacePrinter.print(comma);
        whitespacePrinter.print(space);
        wordPrinter.print(world);
        whitespacePrinter.print(newline);
    }

}