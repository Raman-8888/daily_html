class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>>res=new ArrayList<>();
        int mindeff=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            int diff=Math.abs(arr[i]-arr[i-1]);
            mindeff=Math.min(diff,mindeff);

        }
        for(int i=1;i<arr.length;i++)
        {
            if(Math.abs(arr[i]-arr[i-1])==mindeff)
            {
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return res;

        
    }
}