class Solution {
    public int countDays(int days, int[][] meetings) 
    {
        int n=meetings.length;

        if(n==1) return days-=(meetings[0][1]-meetings[0][0])+1;
		
		Arrays.sort(meetings, Comparator.comparing(a -> a[0]));
		               
        for(int i=1;i<meetings.length;i++)
        {
        	if(meetings[i-1][1]>=meetings[i][0])
        	{
        		meetings[i][0] = Math.min(meetings[i-1][0], meetings[i][0]);
        		meetings[i][1] = Math.max(meetings[i-1][1], meetings[i][1]);
        	}
        	
        	else
        	{
        		days -= (meetings[i-1][1]-meetings[i-1][0])+1;
        	}
        }
        
        days -= (meetings[n-1][1]-meetings[n-1][0])+1;
        
        return days;      
    }
}