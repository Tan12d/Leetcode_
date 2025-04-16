class Solution {
    public long countGood(int[] nums, int k) 
    {
        Map<Long, Long> freq = new HashMap<Long, Long>();
        
        long equal_pairs = 0;
        long good_subarrays = 0;
        
        int n = nums.length;
        int left = 0, right = 0;
        
        while(left<n)
        {
        	while(right<n && equal_pairs<k)
        	{
        		long num = nums[(int)right];
        		
        		freq.put(num, freq.getOrDefault(num, 0L)+1);
        		
        		if(freq.get(num)>1)
        		{
        			equal_pairs += freq.get(num)-1;
        		}
        		
        		right++;
        	}
        	
        	if(equal_pairs>=k)
        	{
        		good_subarrays += n-right+1;
        	}
        	
        	// Remove Left Item
        	long leftNum = nums[(int)left];
        	
        	freq.put(leftNum, freq.get(leftNum)-1);
        	
        	if(freq.get(leftNum)>0)
        	{
        		equal_pairs -= freq.get(leftNum);
        	}
        	
        	left++;
        }
        
        return good_subarrays;        
    }
}