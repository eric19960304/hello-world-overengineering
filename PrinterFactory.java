public class PrinterFactory {
    public Printer getPrinter(String printerType){
        if(printerType == null){
            return getDefaultPrinter();
        }

        if(printerType.equalsIgnoreCase("fancy")){
            return new FancyPrinter();
        }

        return getDefaultPrinter();
    }

    private Printer getDefaultPrinter(){
        return new DefaultPrinter();
    }
}