class Solution {
    public int[] pivotArray(int[] nums, int pivot) 
    {
        ArrayList<Integer> less = new ArrayList<Integer>();
		
		ArrayList<Integer> equal = new ArrayList<Integer>();
        
		ArrayList<Integer> greater = new ArrayList<Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]<pivot)
			{
				less.add(nums[i]);
			}
			
			else if(nums[i]==pivot) 
			{
				equal.add(nums[i]);
			}
			
			else
			{
				greater.add(nums[i]);
			}
		}
		
		less.addAll(equal);
		less.addAll(greater);
		
		return less.stream().mapToInt(Integer::intValue).toArray();
    }
}