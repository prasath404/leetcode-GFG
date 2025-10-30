import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> countMap1 = new HashMap<>();
        Map<Character, Integer> countMap2 = new HashMap<>();

        int st=s.length();
        int st2=t.length();

        if (st!=st2){
            return false;
        }
        for (char a:s.toCharArray()){
            countMap1.put(a,countMap1.getOrDefault(a,0)+1);
        }

        for (char b:t.toCharArray()){
            countMap2.put(b,countMap2.getOrDefault(b,0)+1);
        }
     return countMap1.equals(countMap2);
    }
}