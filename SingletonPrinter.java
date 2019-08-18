public  class SingletonPrinter {

    private static SingletonPrinter single_instance = null;
    public Printer printer = new Printer();

    public static SingletonPrinter getInstance() {
        if (single_instance == null) {
            single_instance = new SingletonPrinter();
        }

        return single_instance;
    }

    public Printer getPrinter() {
        return printer;
    }
}