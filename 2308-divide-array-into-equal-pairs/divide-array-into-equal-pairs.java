class Solution {
    public boolean divideArray(int[] nums) 
    {
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			if(!freq.containsKey(nums[i]))
			{
				freq.put(nums[i], 1);
			}
			
			else
			{
				freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
			}
		}
		
		for(Integer i: freq.values())
		{
			if(i%2!=0) return false;
		}
		
		return true;  
    }
}