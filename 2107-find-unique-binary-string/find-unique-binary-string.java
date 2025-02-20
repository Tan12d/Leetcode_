class Solution {
    public String findDifferentBinaryString(String[] nums) 
    {
        HashSet<Integer> h=new HashSet<Integer>();
        
        for(String s: nums)
        {
        	h.add(Integer.parseInt(s, 2));
        }
        
        int n = nums.length;
        String s="";
        
        for(int i=0;i<=n;i++)
        {
        	if(!h.contains(i))
        	{
                return  String.valueOf('0').repeat(n - Integer.toBinaryString(i).length()) + Integer.toBinaryString(i); 
        	}
        }
        
        return  "";       
    }
}