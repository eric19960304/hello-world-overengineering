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
        Printer wPrinter = factory.getPrinter("word");
        Printer wsPrinter = factory.getPrinter("Whitespace");

        wPrinter.print(hello);
        wsPrinter.print(comma);
        wsPrinter.print(space);
        wPrinter.print(world);
        wsPrinter.print(newline);
    }

}