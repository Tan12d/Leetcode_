class Solution {
    public int tupleSameProduct(int[] nums) 
    {
        if(nums.length<4) return 0;
		
		int val=0;
		
		HashMap<Integer, Integer> freq = new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				freq.put(nums[i]*nums[j], freq.getOrDefault(nums[i]*nums[j], 0)+1);
			}
		}
		
		for(Map.Entry<Integer,Integer> entry: freq.entrySet())
		{
			if(entry.getValue()==2)
			{
				val+=8;
			}
			
			else if(entry.getValue()>2)
			{
				int combinations = (combination(entry.getValue(), 2))*8;
				val+=combinations;
			}
		}      
		
		return val;
    }	
	
	public static int combination(int n, int r) {
        if (r == 0 || r == n) return 1; // Base case
        return combination(n - 1, r - 1) + combination(n - 1, r);
    }
}