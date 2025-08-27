import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map sorted string -> list of anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            // Convert string to char array and sort
            char[] t = str.toCharArray();
            Arrays.sort(t);
            String key = new String(t); // this will be same for all anagrams

            // Add to the map
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        
        // Convert map values to result
        return new ArrayList<>(map.values());
    }
}
