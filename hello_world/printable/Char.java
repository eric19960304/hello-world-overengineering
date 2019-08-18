package hello_world.printable;

public class Char implements Printable {
    private char value;

    public Char(char value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return String.valueOf(value);
    }

}