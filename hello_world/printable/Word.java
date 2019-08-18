package hello_world.printable;
import java.util.ArrayList;

public class Word implements Printable {
    private ArrayList<Letter> value;

    public Word(String value) throws Exception {
        this.value =  new ArrayList<Letter>();
        for (char c : value.toCharArray()) {
            this.value.add(new Letter(c));
        }
    }

    @Override
    public String getValue() {
        String content = "";
        for(Letter c : value) {
            content += c.getValue();
        }
        return content;
    }

}