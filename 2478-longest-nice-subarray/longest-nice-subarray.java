class Solution {
    public int longestNiceSubarray(int[] nums) 
    {
        int curr_sum=0;
		int xor_sum=0;
		
		int left=0, right=0;
		int n = nums.length;
		int maxLen = 0;
		
		
		int temp_right=0;
		int temp_left=0;
		
		while(right<n)
		{ 
			temp_right = nums[right];
			curr_sum += temp_right;			
			xor_sum ^= temp_right;
			
			while(curr_sum!=xor_sum)
			{
				temp_left = nums[left];
				curr_sum -= temp_left;
				xor_sum ^= temp_left;
				
				left++;
			}
			
			maxLen = Math.max(maxLen, right-left+1);
			
			right++;
		}
		
		return maxLen;
    }
}