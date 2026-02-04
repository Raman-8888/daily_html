class Solution {
    public int evalRPN(String[] arr) {
        
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            String c=arr[i];
            if(c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/"))
            {
                int b=st.pop();
                int a=st.pop();
                if(c.equals("+"))
                {
                    st.push(a+b);
                }
                else if(c.equals("-"))
                {
                    st.push(a-b);
                }
                else if(c.equals("*"))
                {
                    st.push(a*b);
                }
                else
                {
                    st.push(a/b);
                }
                
            }
            else
            {
                st.push(Integer.parseInt(arr[i]));
                
            }
        }
        return st.pop();


        
    }
}