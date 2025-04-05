class Solution {
    public int subsetXORSum(int[] nums) 
    {
        return result(nums,0,0);        
    }

    public int result(int nums[], int i, int currXor)
    {
        if(i==nums.length) return currXor;

        int include = result(nums, i+1, currXor^nums[i]);
        int exclude = result(nums, i+1, currXor);

        return include+exclude;
    }	
}