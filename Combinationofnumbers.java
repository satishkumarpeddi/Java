import java.util.*;

public class Combinationofnumbers {
    public static void generateAllNumber(long current, long limit, List<Long> result){
        if(current>=limit)
            return;
        if(current!=0)
            result.add(current);
        generateAllNumber(current*10+2, limit, result);
        generateAllNumber(current*10+5, limit, result);
    }
    public static List<Long> countAllNumberInRange(long num){
        List<Long> result = new ArrayList<>();
        generateAllNumber(0,num,result);
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of range : ");
        long num = sc.nextLong();
        List<Long> result = countAllNumberInRange(num);
        Collections.sort(result);
        System.out.println(result);
    }
}
