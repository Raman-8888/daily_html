class Solution {
    public int majorityElement(int[] arr) {

        int n=arr.length/2;
        if(arr.length==1)return arr[0];
        Arrays.sort(arr);
        ArrayList<Integer>list=new ArrayList<>();
        int count=1;
        for(int i=0;i<arr.length;i++)
        {
            if(!list.contains(arr[i]))
            {
                list.add(arr[i]);
                count=1;
            }
            else
            {
                count++;
                if(count>n)return arr[i];
            }

        }
        return 0;
        
    }
}