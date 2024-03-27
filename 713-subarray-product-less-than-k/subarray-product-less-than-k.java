class Solution {
    public int numSubarrayProductLessThanK(int[] a, int k) 
    {
        int i=0,j=0,c=0,product=1;
		
		int size = a.length;
		
		while(j<size||i<size)
		{
			if(j==size)
			{
				i++;
				j=i;
				product=1;
			}
			
			if(i==size)
				break;

			
			product*=a[j];
			
			
			if(product<k)
			{
				c++;
				j++;
			}
			
			else
			{
				i++;
				j=i;
				product=1;
			}
		}
        
        return c;
    }
}