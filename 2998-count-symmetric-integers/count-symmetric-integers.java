class Solution {
    public int countSymmetricIntegers(int low, int high) 
    {
		int count = 0;
		
        for(int i=low;i<=high;i++)
        {
        	String num = String.valueOf(i);
        	int len = num.length();
        	
        	if(len%2==0)
        	{
        		int half = len/2;
        		int leftsum = 0, rightsum = 0;
        		
        		for(int j=0;j<half;j++)
        		{
        			leftsum += num.charAt(j)-'0';
        		}
        		
        		for(int k=half;k<len;k++)
        		{
        			rightsum += num.charAt(k)-'0';
        		}
        		
        		if(leftsum==rightsum) count++;
        	}
        }      
        
        return count;
    }
}