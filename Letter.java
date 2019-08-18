public class Letter extends Char {

    public Letter(char value) throws Exception {
        super(value);

        if(!Character.isLetter(value)){
            throw new Exception("Not a Letter");
        }
    }

}