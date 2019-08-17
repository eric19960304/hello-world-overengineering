public class HelloWorld {

    public static void main(String[] args) {
        PrinterFactory factory = new PrinterFactory();
        factory.getPrinter(null).print("Hello, World");
        factory.getPrinter("fancy").print("Hello, World");
    }

}