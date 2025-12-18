package  NumberPrinterPackage;
public class NumberPrinterMethod implements Runnable{
    int num;
    public NumberPrinterMethod(int num){
        this.num=num;
    }
    @Override
    public void run(){
        System.out.println(num+" "+Thread.currentThread().getName());
    }
}