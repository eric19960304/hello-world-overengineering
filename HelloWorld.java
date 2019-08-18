import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class HelloWorld {

    public static void main(String[] args) {
        // prepare printing contents
        PrintableFactory printableFactory = new PrintableFactory();
        List<PrintableType> types = Arrays.asList( 
            PrintableType.HELLO, PrintableType.COMMA, 
            PrintableType.SPACE, PrintableType.WORLD, PrintableType.NEWLINE );
        List<Printable> contents  = types.stream()
            .map(t -> printableFactory.getPrintable(t))
            .collect(Collectors.toList());

        // add jobs to printer
        Printer printer = new PrinterFactory().getPrinter();
        for(Printable p : contents) {
            if (p instanceof Word) {
                printer.addJob(new PrintWordCommand(p));
            } else if (p instanceof Whitespace){
                printer.addJob(new PrintWhitespaceCommand(p));
            }
        }

        // print all the jobs
        printer.processAllJobs();
    }

}