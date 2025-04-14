class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) 
    {
        int count = 0;
		int n = arr.length;
		
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				if(Math.abs(arr[j]-arr[i])<=a)
				{
					for(int k=j+1;k<n;k++)
					{
						if(Math.abs(arr[k]-arr[j])<=b && Math.abs(arr[i]-arr[k])<=c)
						{
							count++;
						}
					}
				}
			}
		}
		       
		return count;        
    }
}