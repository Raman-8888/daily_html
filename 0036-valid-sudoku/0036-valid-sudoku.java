class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
        if(board.length!=9||board[0].length!=9)
        {
            return false;
        }
        boolean isvalid=true;
        for(int i=0;i<board.length;i++)
        {
           HashSet<Character> set = new HashSet<>(); 
            for(int j=0;j<board[i].length;j++)
            {
                if(board[i][j]=='.')
                {
                    continue;
                }
                else
                {
                    if(!set.contains(board[i][j]))
                    {
                        set.add(board[i][j]);
                    }
                    else
                    {
                        return false;
                    }
                }

            }
        }
        for(int i=0;i<board[0].length;i++)
        {
           HashSet<Character> set = new HashSet<>(); 
            for(int j=0;j<board.length;j++)
            {
                if(board[j][i]=='.')
                {
                    continue;
                }
                else
                {
                    if(!set.contains(board[j][i]))
                    {
                        set.add(board[j][i]);
                    }
                    else
                    {
                        return false;
                    }
                }

            }
        }
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                HashSet<Character> set = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char curr = board[boxRow * 3 + i][boxCol * 3 + j];
                        if (curr == '.') continue;
                        if (set.contains(curr)) return false;
                        set.add(curr);
                    }
                }
            }
        }
        return true;
        
    }
}