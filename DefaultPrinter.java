class DefaultPrinter implements Printer {

    @Override
    public void print(Object objectToPrint){
        String stringToPrint = (String) objectToPrint;
        System.out.println("[Default Printer]");
        System.out.println(stringToPrint);
        System.out.println();
    }
}