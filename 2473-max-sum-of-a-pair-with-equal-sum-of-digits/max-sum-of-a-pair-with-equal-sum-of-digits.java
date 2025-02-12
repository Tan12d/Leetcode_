class Solution {
    public int maximumSum(int[] nums) 
    {
        HashMap<Integer, List<Integer>> h=new HashMap<Integer, List<Integer>>(); 
		
		int val=0;
		
        for(int i=0;i<nums.length;i++)
        {
        	int n=nums[i];
        	
        	while(n!=0)
        	{
        		val+=n%10;
        		
        		n/=10;
        	}
        	
        	h.putIfAbsent(val, new ArrayList<Integer>());
        	h.get(val).add(nums[i]);
        	val=0;
        }
        
        System.out.println(h);
        
        int max_Sum = 0;
        val=0;
        
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
}