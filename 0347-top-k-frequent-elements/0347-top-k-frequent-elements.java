import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums)
        {
            int sum=1;
            if(!map.containsKey(i))
            {
                map.put(i,sum);
            }
           else
           {
                map.put(i,map.get(i)+1);
           }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        int arr[]=new int[k];
        for(int i=0;i<k;i++)
        {
            arr[i]=list.get(i).getKey();

        }
        return arr;

    }
}