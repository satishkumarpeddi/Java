interface One{
    public void OverrideIt();
    public default void Check(){
        System.out.println("Default method from One interface.");
    }
}
public class Interface {
    public static void main(String[] args){
        One exOne = new One(){
            @Override 
            public void OverrideIt(){
                System.out.println("from anonymouClass Method");
            }
        };
        exOne.Check();
        exOne.OverrideIt();
    }
}
