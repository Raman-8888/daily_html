class Solution {
    public int[] twoSum(int[] arr, int t) {
        
        int s=0,e=arr.length-1;

        while(e>s)
        {
            int sum=arr[e]+arr[s];
            if(sum==t)
            {
                return new int[]{s+1,e+1};

            }
            if(sum>t)
            {
                e--;
            }
            else
            {
                s++;
            }
        }
        return new int[]{0,0};



        
    }
}