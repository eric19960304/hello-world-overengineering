package hello_world.printer;
import hello_world.printable.Printable;
import hello_world.printable.Whitespace;

public class WhitespacePrinter implements Printer {

    @Override
    public void print(Printable printable){
        Whitespace whitespace = (Whitespace) printable;
        System.out.print(whitespace.getValue());
    }

}