package hello_world.printer;

public class SingletonWhitespacePrinter {

    private static SingletonWhitespacePrinter single_instance = null;
    public WhitespacePrinter whitespacePrinter;

    public SingletonWhitespacePrinter() {
        whitespacePrinter = new WhitespacePrinter();
    }

    public static SingletonWhitespacePrinter getInstance() {
        if (single_instance == null) {
            single_instance = new SingletonWhitespacePrinter();
        }
        return single_instance;
    }

    public WhitespacePrinter getWhitespacePrinter() {
        return whitespacePrinter;
    }
}