class Solution {
    public boolean areAlmostEqual(String s1, String s2) 
    {
        int count=0;
		
		if(s1.equals(s2)) return true;
		
		HashMap<Character, Integer> h1=new HashMap<Character, Integer>();
		HashMap<Character, Integer> h2=new HashMap<Character, Integer>();
		
        for(int i=0;i<s1.length();i++)
		{
			if(s1.indexOf(s2.charAt(i))==-1) return false;
			
			h1.put(s1.charAt(i), h1.getOrDefault(s1.charAt(i), 0)+1);
			h2.put(s2.charAt(i), h2.getOrDefault(s2.charAt(i), 0)+1);
		}
        
        for(int i=0;i<s1.length();i++)
        {
        	if(h1.get(s1.charAt(i))!=h2.get(s1.charAt(i))) return false;
        }
        
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i)) count++;			
		}
		
		return (count==2) ? true : false; 
    }
}