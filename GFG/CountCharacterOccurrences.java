package GFG;
import java.util.*;
import java.io.*;
public class CountCharacterOccurrences {
    public static void main(String[] args)throws IOException{
        // BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while(testCases-->0){
            String st1 = sc.nextLine();
            String st2 = sc.nextLine();
            char[] st1Arr = st1.toCharArray();
            char[] st2Arr = st2.toCharArray();
            HashMap<Character,Integer> map = new HashMap<>();
            for(char ch : st1Arr)
                map.put(ch,map.getOrDefault(ch,0)+1);
            int sum = 0;
            for(int i=0;i<st2Arr.length;i++)
                sum+=map.getOrDefault(st2Arr[i],0);
            System.out.println(sum);
        }
        sc.close();
    }
}
