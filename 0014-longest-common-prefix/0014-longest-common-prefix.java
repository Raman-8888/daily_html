class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        int n=minLen(strs);
        
        for(int i=0;i<n;i++)
        {
            String sub=strs[0].substring(0,i+1);
            
            boolean flag=true;
            for(int j=0;j<strs.length;j++)
            {
                if(strs[j].substring(0,i+1).equals(sub))
                {
                    // Match found, continue checking
                    System.out.println(sub);
                }
                else
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                res=sub;
            }
        }
        return res;
    }

    public int minLen(String s[])
    {
        int min=Integer.MAX_VALUE;
        for(String str:s)
        {
            if(str.length()<min)
            {
                min=str.length();
            }
        }
        return min;
    }
}