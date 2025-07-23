import java.util.*;
interface PaymentMethod{
    void pay();
}
class DebitCard implements PaymentMethod{
    public void pay(){
        System.out.println("Transaction via Debit Card\n");
    }
}
class CreditCard implements PaymentMethod{
    public void pay(){
        System.out.println("Transaction via Credit Card\n");
    }
}
class UPI implements PaymentMethod{
    public void pay(){
        System.out.println("Transaction via UPI\n");
    }
}
public class interfaceClasses{
    public static void makeTransaction(PaymentMethod pm){
        pm.pay();
    }
    public static void main(String[] args){
    PaymentMethod pm = new CreditCard();
    makeTransaction(pm);
    }
}