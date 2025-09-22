import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int maxFreq = 0;
        for (int n : nums) {
            int count = map.getOrDefault(n, 0) + 1;
            map.put(n, count);
            maxFreq = Math.max(maxFreq, count);
        }

        int result = 0;
        for (int val : map.values()) {
            if (val == maxFreq) {
                result += val;
            }
        }
        return result;
    }
}
