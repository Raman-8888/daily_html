class Solution {
    public int canBeTypedWords(String text, String b) {
        String arr[]=text.split(" ");
        int count=0;


        for(String s:arr)
        {
            boolean check=true;
            for(int i=0;i<b.length();i++)
            {
                if(s.indexOf(b.charAt(i)) != -1)
                {
                    check=false;
                    break;

                }
                

            }
            if(check)
            {
                count++;
            }


        }
        return count;

        
    }
}