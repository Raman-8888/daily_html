class Solution {
    public int minPairSum(int[] arr) {
        Arrays.sort(arr);
        
        int s=0;
        int e=arr.length-1;
        int sum=0;
        while(s<e)
        {
            sum=Math.max(sum,arr[s]+arr[e]);
            s++;e--;
        }

       
        return sum;

    }
}