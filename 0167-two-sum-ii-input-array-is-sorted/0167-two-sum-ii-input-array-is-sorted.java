class Solution {
    public int[] twoSum(int[] arr, int t) {
        int res[]=new int[2];
        int s=0,e=arr.length-1;
        while(s<e)
        {
            int sum=arr[s]+arr[e];
            if(sum==t)
            {
                res[0]=s+1;
                res[1]=e+1;
                return res;
            }
            else if(t>sum)s++;
            else e--;
        }
        return res;



        
    }
}