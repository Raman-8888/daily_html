class Solution {
    public boolean isPerfectSquare(int num) {

        double a=Math.sqrt(num);

        if(a-Math.floor(a)==0)
        {
            return true;

        }
        else
        {
            return false;
        }


        
        
    }
}