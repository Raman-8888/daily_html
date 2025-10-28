class Solution {
    public String convert(String s, int n) {

    if(n==1||s.length()<n)return s;

    String arr[]=new String[n];
    for(int i=0;i<n;i++)
    {
        arr[i]="";
    }
    int count=0;
    boolean down=true;
    char str[]=s.toCharArray();
    

    for(char c:str)
    {
        arr[count]+=c;

        if(count==n-1)
        {
            down=false;
        }

        else if(count==0)
        {
            down=true;
        }
        if(down)count++;
        else count--;
    }

    String res="";
    for(String i:arr)
    {
        res+=i;
    }
    return res;
    }
        
}
