import java.util.function.*;
public class CurryingDemo {
    public static void main(String[] args){
        Function<Integer,Function<Integer,Integer>> addCurried = x->y->x+y;
        int result = addCurried.apply(5).apply(10);
        System.out.println(result);
    }
}
