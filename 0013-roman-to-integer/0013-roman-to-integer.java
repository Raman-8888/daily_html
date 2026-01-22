class Solution {
    int value(char c)
         {
            if(c=='M')return 1000;
            else if(c=='D')return 500;
            else if(c=='C')return 100;
            else if(c=='L')return 50;
            else if(c=='X')return 10;
            else if(c=='V')return 5;
            else return 1;
         }
    public int romanToInt(String s) {
        int sum=0;
        for(int i=1;i<s.length();i++)
        {
            char c=s.charAt(i);
            int curr=value(s.charAt(i-1));
            int next=value(s.charAt(i));
            
            if(curr<next)
            {
                sum-=curr;
            }
            else
            {
                sum+=curr;

            }

        }
        int last=value(s.charAt(s.length()-1));
        sum+=last;
        return sum;
        
    }
}