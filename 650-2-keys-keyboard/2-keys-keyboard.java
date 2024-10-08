class Solution {
    public int minSteps(int n) 
    {
        if(n==1)
        {
            return 0;
        }

        int [] dp=new int[n+1];

        for (int i = 1; i <= n; i++) 
        {
            dp[i] = i;
            for (int j = i / 2; j >= 1; j--) 
            {
                if (i % j == 0) 
                {
                    int d=i/j;
                    dp[i] = Math.min(dp[i], dp[j] + d);
                    break;
                }
            }
        }
        
        return dp[n];
    }
}