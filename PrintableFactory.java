public class PrintableFactory {

    public Printable getPrintable(PrintableType printableType) {
        if (printableType == null) {
            return null;
        }

        try {
            switch (printableType) {
                case COMMA:
                    return new Comma();
                case SPACE:
                    return new Space();
                case EXCLAMATION_MARK:
                    return new ExclamationMark();
                case NEWLINE:
                    return new Newline();
                case HELLO:
                    return new Hello();
                case WORLD:
                    return new World();
            }
        } catch(Exception e) {
            System.out.println(e.toString());
            System.exit(0);
        }

        return null;
    }
}