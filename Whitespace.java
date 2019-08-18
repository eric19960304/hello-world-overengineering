public class Whitespace extends Char {

    public Whitespace(char value) throws Exception {
        super(value);
        if(value != '\n' && value !=' ' && value != ',') {
            throw new Exception("Not a Whitespace");
        }
    }

}