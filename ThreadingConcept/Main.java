import NumberPrinterPackage.NumberPrinterMethod;
public class Main {
    public static void main(String[] args){
        for(int i=1;i<=100;++i){
            NumberPrinterMethod  np = new NumberPrinterMethod(i);
            Thread thread = new Thread(np);
            thread.start();
        }
    }
}
