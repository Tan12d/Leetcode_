class Solution {
    public int maxAscendingSum(int[] nums) 
    {
        if(nums.length == 1) return nums[0];

        int max_sum = 0, sum=0;
		
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]<nums[i+1])
			{
				sum+=nums[i];
			}
			
			else
			{
				sum += nums[i];
				
				max_sum = Math.max(max_sum, sum);
				sum=0;
			}
		}
        
		if(nums[nums.length-2] < nums[nums.length-1]) sum +=nums[nums.length-1];
		
		max_sum = Math.max(max_sum, sum);
		
		return max_sum;
    }
}