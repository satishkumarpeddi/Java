import java.util.*;
public class KAnagram {
    public static void main(String[] args){
        String a ="anagram",b="grammar";
        System.out.println(areKAnagrams(a,b,3));
    }
        static boolean areKAnagrams(String s1,String s2,int k){
            Map<Character,Integer> map = new HashMap<>();
            for(char ch:s1.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            for(char ch1: s2.toCharArray()){
                if(map.getOrDefault(ch1, 0)>0){
                    map.put(ch1,map.get(ch1)-1);
                }
            }
            int c=0;
            for(int num:map.values()) c+=num;
            return c<=k;
        }
}
