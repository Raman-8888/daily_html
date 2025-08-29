class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
        int n=9;
        HashSet<Character>[]rows=new HashSet[n];
        HashSet<Character>[]col=new HashSet[n];
        HashSet<Character>[]box=new HashSet[n];
        for(int i=0;i<9;i++)
        {
            rows[i]=new HashSet<Character>();
            col[i]=new HashSet<Character>();
            box[i]=new HashSet<Character>();
        }
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char val=board[i][j];
                if(val=='.')
                {
                    continue;
                }
            
                if(rows[i].contains(val))
                {
                    return false;
                }
                rows[i].add(val);

                if(col[j].contains(val))
                {
                    return false;
                }
                col[j].add(val);

                int idx=(i/3)*3 +j/3;
                if(box[idx].contains(val))
                {
                    return false;
                }
                box[idx].add(val);
            }

        }
        return true;
    }
        
}