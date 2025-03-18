class Solution {
    public int longestNiceSubarray(int[] nums) 
    {
        int curr_sum=0;
		int xor_sum=0;
		
		int left=0, right=0;
		int n = nums.length;
		int maxLen = 0;
		
		while(right<n)
		{ 
			curr_sum += nums[right];			
			xor_sum ^= nums[right];
			
			while(curr_sum!=xor_sum)
			{
				curr_sum -= nums[left];
				xor_sum ^= nums[left];
				
				left++;
			}
			
			maxLen = Math.max(maxLen, right-left+1);
			
			right++;
		}
		
		return maxLen;
    }
}