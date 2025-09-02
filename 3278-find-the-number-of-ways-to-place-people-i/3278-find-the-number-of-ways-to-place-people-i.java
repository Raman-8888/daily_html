class Solution {
    public int numberOfPairs(int[][] points) {
        int sum=0;
        for(int i=0;i<points.length;i++)
        {   
            for(int j=0;j<points.length;j++)
            {
                if(i==j) continue;
                boolean flag=true;
                int Tlx=points[i][0];
                int Tly=points[i][1];

                int Brx=points[j][0];
                int Bry=points[j][1];

                if(Tly<Bry||Tlx>Brx)continue;
                for(int k=0;k<points.length;k++)
                {
                    int p1= points[k][0];
                    int p2= points[k][1];

                    if(k==i||k==j)continue;
                    if(p1>=Tlx&&p2<=Tly
                    && p1<=Brx && p2>=Bry)
                    {
                        flag=false;
                        break;
                    }
                }
                if(flag)
                {
                    sum++;
                }

            }
        }
        return sum;
        
    }
}