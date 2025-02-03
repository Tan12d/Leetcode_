class Solution {
    public int longestMonotonicSubarray(int[] nums) 
    {
        int inc_longest = 1, j=1, dec_longest=1, k=1;
        
        for(int i=0;i<nums.length-1;i++)
        {
        	if(nums[i] < nums[i+1])
        	{
        		j++;
        	}
        	
        	else
        	{
        		inc_longest=Math.max(inc_longest, j);
        		j=1;
        	}
        }
        
        inc_longest = Math.max(inc_longest, j);
        
        for(int i=0;i<nums.length-1;i++)
        {
        	if(nums[i] > nums[i+1])
        	{
        		k++;
        	}
        	
        	else
        	{
        		dec_longest=Math.max(dec_longest, k);
        		k=1;
        	}
        }
        
        dec_longest = Math.max(dec_longest, k);
        
        return inc_longest > dec_longest ? inc_longest : dec_longest;      
    }
}