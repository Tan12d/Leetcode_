class Solution {
    public int minimumRecolors(String blocks, int k) 
    {
        int n = blocks.length();
        
        int blacks=0;
        int min_recoloring = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++)
        {
        	if(blocks.charAt(i)=='B') blacks++;
        	
        	if(i>=k-1)
        	{
        		min_recoloring = Math.min(min_recoloring, k-blacks);
        		
        		if(blocks.charAt(i-k+1)=='B') blacks--;
        	}
        }
        
        return min_recoloring;        
    }
}