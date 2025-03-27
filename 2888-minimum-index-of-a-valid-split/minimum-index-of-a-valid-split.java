class Solution {
    public int mooreVotingAlgo(List<Integer> nums)
	{
		int majorityEl = nums.get(0);
        int freq=1;
        
        for(int i=1;i<nums.size();i++) 
        {
        	if(majorityEl!=nums.get(i)) freq--;
        	
        	else freq++;

        	if(freq==0)
        	{
        		majorityEl = nums.get(i);
        		freq=1;
        	}
        }
        
        return majorityEl;
	}
	
	public int minimumIndex(List<Integer> nums) 
    {
        int n = nums.size();
        
        int majorityElement = mooreVotingAlgo(nums);
        
        int max_freq=0;
        
        for(int i=0;i<n;i++)
        {
        	if(majorityElement==nums.get(i))
        	{
        		max_freq++;
        	}
        }
        
        int prefix_count=0;
        
        for(int i=0;i<n-1;i++)
        {
        	if(majorityElement==nums.get(i))
        	{
        		prefix_count++;        		
        		max_freq--;
        	}
        	
        	if((prefix_count>(i+1)/2) && (max_freq>(n-i-1)/2))
        	{
        		return i;
        	}
        }
        
        return -1;
    }
}