class Solution {

    public int check(int []arr,int target,boolean b)
    {
        int l=0;int r=arr.length-1;
        int ans=-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                if(b)
                {
                    
                    r=mid-1;
                }
                else
                {
                    l=mid+1;
                }
            }
            else if(arr[mid]<target)
            {
                l=mid+1;

            }
            else
            {
                r=mid-1;
            }
        }
        return ans;

    } 
    public int[] searchRange(int[] arr, int target) {
        
        int low=check(arr,target,true);
        int high=check(arr,target,false);

        return new int[]{low,high};
    }
}