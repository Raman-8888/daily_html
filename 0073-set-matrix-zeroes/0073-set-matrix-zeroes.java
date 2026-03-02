class Solution {
    public void setZeroes(int[][] arr) {

         boolean[][] zero = new boolean[arr.length][arr[0].length];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==0)
                {
                    zero[i][j]=true;
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if(zero[i][j])
                    set(i, j, arr);
            }
        }
        
    }
    void set(int r,int c,int arr[][])
    {
        for(int j=0;j<arr[0].length;j++)
        {
            arr[r][j]=0;
        }

        for(int i=0;i<arr.length;i++)
        {
            arr[i][c]=0;
        }
    }
}