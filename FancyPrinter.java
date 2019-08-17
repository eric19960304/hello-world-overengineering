public class FancyPrinter implements Printer {

    @Override
    public void print(Object objectToPrint){
        String stringToPrint = (String) objectToPrint;
        String decorator = "*";
        String bar = "";
        for(int i=0; i < stringToPrint.length() + 4*decorator.length(); i++){
            bar += "*";
        }
        System.out.println("[Fancy Printer]");
        System.out.println(bar);
        System.out.println(decorator + " " + stringToPrint + " " + decorator);
        System.out.println(bar);
        System.out.println();
    }

}