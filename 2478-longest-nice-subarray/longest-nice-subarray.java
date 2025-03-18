class Solution {
    public int longestNiceSubarray(int[] nums) 
    {
        int left=0;
        int maxLen=0;
        
        int bitsUnion = 0;
        
        int n=nums.length;
        
        for(int right=0;right<n;right++)
        {
        	int temp = nums[right];
        	
        	while((bitsUnion & temp)!=0)
        	{
        		bitsUnion &= ~nums[left];

                left++;
        	}
        	
        	bitsUnion |= temp;
        	
        	maxLen = Math.max(maxLen, right-left+1);
        }
        
        return maxLen;        
    }
}