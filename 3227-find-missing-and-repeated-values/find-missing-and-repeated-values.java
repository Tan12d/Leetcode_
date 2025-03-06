class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        int res[] = new int[2];
		
		int n=grid.length*grid.length;
		
		int freq[] = new int[n+1];
		
		for(int cols[]: grid)
		{
			for(int i: cols)
			{
				freq[i]++;
			}
		}
		
		for(int i=1;i<freq.length;i++)
		{
			if(freq[i]==2) res[0]=i;
			
			if(freq[i]==0) res[1]=i;
		}
		
		return res;        
    }
}