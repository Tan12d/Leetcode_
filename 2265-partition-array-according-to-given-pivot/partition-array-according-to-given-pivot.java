class Solution {
    public int[] pivotArray(int[] nums, int pivot) 
    {
        int n=nums.length;
		
		int less[]=new int[n];
		int high[]=new int[n];
		int res[] = new int[n];
		
		int count=0;
		int j=0;
		int k=0;
		
		for(int i=0;i<n;i++)
		{
			if(nums[i]<pivot)
			{
				less[j++]=nums[i];
			}
			
			else if(nums[i]==pivot)
			{
				count++;
			}
			
			else 
			{
				high[k++]=nums[i];
			}
		}
		
		int index=0;
		
		for(int i=0;i<j;i++)
		{
			res[index++]=less[i];
		}
				
		for(int i=0;i<count;i++)
		{
			res[index++]=pivot;
		}
		
		for(int i=0;i<k;i++)
		{
			res[index++]=high[i];
		}
				
		return res;
    }
}