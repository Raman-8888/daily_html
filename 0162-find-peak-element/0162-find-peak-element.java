class Solution {
    public int findPeakElement(int[] arr) {

        int idx=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                idx=i;
            }
        }
        return idx;        
    }
}