import java.util.*;

class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> v = new HashMap<>();
        HashMap<Character, Integer> co = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if ("aeiou".indexOf(c) != -1) {
                v.put(c, v.getOrDefault(c, 0) + 1);
            } else {
                co.put(c, co.getOrDefault(c, 0) + 1);
            }
        }

        int maxV = v.isEmpty() ? 0 : Collections.max(v.values());
        int maxC = co.isEmpty() ? 0 : Collections.max(co.values());
        
        return maxV + maxC;
    }
}
