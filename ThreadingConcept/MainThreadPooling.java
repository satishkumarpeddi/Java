import NumberPrinterPackage.NumberPrinterMethod;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThreadPooling {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        for(int i=1;i<=100;++i){
            NumberPrinterMethod np = new NumberPrinterMethod(i);
            executorService.submit(np);
        }
    }
}
