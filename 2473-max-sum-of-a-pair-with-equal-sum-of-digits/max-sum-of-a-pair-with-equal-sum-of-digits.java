class Solution {
	
	public int maximumSum(int nums[])
	{
		HashMap<Integer, Integer> sum_num=new HashMap<Integer, Integer>();
		
		int max_Sum=-1;
		
		for(int i=0;i<nums.length;i++)
        {
        	int total_sum = getDigitSum(nums[i]);
        	
        	if(!sum_num.containsKey(total_sum))
        	{
        		sum_num.put(total_sum, nums[i]);
        	}
        	
        	else
        	{
        		max_Sum = Math.max(max_Sum, sum_num.get(total_sum)+nums[i]);
        		sum_num.put(total_sum, Math.max(sum_num.get(total_sum), nums[i]));
        	}
        }
		
		return max_Sum;		
	}

    public int getDigitSum(int n)
	{
		int val=0;
		
		while(n>0)
    	{
    		val+=n%10;    		
    		n/=10;
    	}
		
		return val;
	}
}