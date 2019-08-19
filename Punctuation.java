import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Punctuation extends Char {

    public Punctuation(char value) throws Exception {
        super(value);
        Pattern p = Pattern.compile("\\p{Punct}");
        Matcher m = p.matcher(""+value);
        if(!m.find()) {
            throw new Exception("Not a Punctuation");
        }
    }

}