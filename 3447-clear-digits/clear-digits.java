class Solution {
    public String clearDigits(String s) 
    {
       StringBuilder res = new StringBuilder(s);
		
        for(int i=0;i<res.length();i++)
        {
        	if(res.charAt(i)>='0' && res.charAt(i)<='9') 
        	{
        		if(i!=0)
        		{
        			res.delete(i-1, i+1);
        		}
        		
        		i=0;
        	}
        }    
        
        return res.toString();       
    }
}