class Solution 
{
    public boolean isPowerOfTwo(int n) 
    {
         if(n==1)
	            return true;

	     if(n%2==0 && n>1)
	     {
	    	 int res=0;

	         for(int i=1;i<=Integer.toBinaryString(n).length();i++)
			 {
	            res+=(n>>i)&1;
	         }

	         return res==1;
	     }
	     
	     return false;		
    }
}