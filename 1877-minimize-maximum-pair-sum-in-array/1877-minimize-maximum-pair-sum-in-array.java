class Solution {
    public int minPairSum(int[] arr) {
        Arrays.sort(arr);
        List<Integer> res=new ArrayList<>();
        int s=0;
        int e=arr.length-1;
        while(s<e)
        {
            res.add(arr[s]+arr[e]);

            
            s++;e--;
        }

        int max=0;
        for(int i=0;i<res.size();i++)
        {
            if(res.get(i)>max)
            {
                max=res.get(i);
            }
        }
        return max;

    }
}