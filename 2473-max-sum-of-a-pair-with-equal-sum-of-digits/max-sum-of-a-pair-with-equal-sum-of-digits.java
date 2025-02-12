class Solution {
    public int maximumSum(int[] nums) 
    {
        HashMap<Integer, List<Integer>> h=new HashMap<Integer, List<Integer>>(); 
		
		for(int i=0;i<nums.length;i++)
        {
        	int total_sum = getDigitSum(nums[i]);
        	
        	h.putIfAbsent(total_sum, new ArrayList<Integer>());
        	h.get(total_sum).add(nums[i]);  
        }
        
        int max_Sum = 0;
        int val=0;
        
        for(List<Integer> value: h.values())
        {
        	if(value.size()==2)
        	{
        		val+=(value.get(0)+value.get(1));
        	}
        	
        	else if(value.size()>2)
        	{
        		Collections.sort(value, Collections.reverseOrder());
        		
        		val+=(value.get(0)+value.get(1));   		
        	}
        	
        	max_Sum = Math.max(max_Sum, val);
        	val=0;
        }
        
        if(max_Sum==0) return -1;
        
        return max_Sum;
    }
	
	public static int getDigitSum(int n)
	{
		int val=0;
		
		while(n!=0)
    	{
    		val+=n%10;    		
    		n/=10;
    	}
		
		return val;
	}
}