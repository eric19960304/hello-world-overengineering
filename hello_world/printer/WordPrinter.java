package hello_world.printer;
import hello_world.printable.Printable;
import hello_world.printable.Word;

public class WordPrinter implements Printer {

    @Override
    public void print(Printable printable){
        Word whitespace = (Word) printable;
        System.out.print(whitespace.getValue());
    }
}