class Solution {
    public int peakIndexInMountainArray(int[] arr) {


        int max=Integer.MIN_VALUE;
        int idx=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                idx=i;
            }

        }
        if(idx!=0&&idx!=arr.length-1)
        {
            return idx;
        }
        else
        {
            return 0;
        }
        
    }
}