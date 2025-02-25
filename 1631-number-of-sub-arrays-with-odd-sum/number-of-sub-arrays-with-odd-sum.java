class Solution 
{
    public int numOfSubarrays(int[] arr) 
    {
        int MOD = 1000000007;
    	int odd_count=0;
    	int even_count=1;
    	
    	int total=0;
    	int prefix_sum=0;
        
    	for(int i: arr)
    	{
    		prefix_sum+=i;
    		
    		if((prefix_sum & 1) == 1)
    		{
    			total = (total+even_count)%MOD;
    			odd_count++;
    		}
    		
    		else
    		{
    			total = (total + odd_count)%MOD;
    			even_count++;
    		}
    	}
    	
    	return total;        
    }
}