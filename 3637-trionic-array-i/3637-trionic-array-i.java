class Solution {

    int first(int nums[])
    {
        int i=1;
        for(;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                break;
            }
        }
        
        return i;

    }

    int second(int nums[],int i)
    {
        
            for(;i<nums.length;i++)
            {
                if(nums[i]>=nums[i-1])
                {
                    break;

                }

            }
            return i;

    }
    boolean third(int nums[],int i)
    {
        boolean step=false;
        for(;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                break;
            }
            step=true;
        }
        return (step&&i==nums.length);
        

    }
    public boolean isTrionic(int[] nums) {

        int idx1=first(nums);
        if(idx1==1)return false;
        int idx2=second(nums,idx1);
        if(idx1==idx2)return false;

        return(third(nums,idx2));
        
    }
}