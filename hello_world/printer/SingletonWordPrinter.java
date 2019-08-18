package hello_world.printer;

public  class SingletonWordPrinter {

    private static SingletonWordPrinter single_instance = null;

    public WordPrinter wordPrinter;

    public SingletonWordPrinter() {
        wordPrinter = new WordPrinter();
    }

    public static SingletonWordPrinter getInstance() {
        if (single_instance == null) {
            single_instance = new SingletonWordPrinter();
        }

        return single_instance;
    }

    public WordPrinter getWordPrinter() {
        return wordPrinter;
    }
}