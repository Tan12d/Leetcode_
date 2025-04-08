class Solution {
    public int minimumOperations(int[] nums) 
    {
        int freq[] = new int[101];
		
		int lastIdx = 0;
		
		for(int i=nums.length-1;i>=0;i--)
		{
			freq[nums[i]]++;

			if(freq[nums[i]]>1)
			{
				lastIdx = i+1;
				break;
			}			
		}
        
		if(lastIdx%3==0) return lastIdx/3;
		
        return lastIdx/3 + 1;
    }
}