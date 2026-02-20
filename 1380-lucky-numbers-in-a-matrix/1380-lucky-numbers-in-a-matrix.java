class Solution {

    public List<Integer> luckyNumbers(int[][] matrix) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(check(i,j,matrix))
                {
                    list.add(matrix[i][j]);
                }
            }
        }

        return list;
    }

    boolean check(int i,int j,int [][]matrix)
    {
        int num = matrix[i][j];

        for(int c=0;c<matrix[0].length;c++)
        {
            if(matrix[i][c] < num)
                return false;
        }

        for(int r=0;r<matrix.length;r++)
        {
            if(matrix[r][j] > num)
                return false;
        }

        return true;
    }
}
