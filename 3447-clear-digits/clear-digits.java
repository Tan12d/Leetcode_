class Solution {
    public String clearDigits(String s) 
    {
       StringBuilder res = new StringBuilder(s);
		
        Stack<Character> characters = new Stack<Character>();
        
        for(int i=0;i<res.length();i++)
        {
        	if(res.charAt(i)>='a' && res.charAt(i)<='z') characters.push(res.charAt(i));
        	
        	else if(!characters.isEmpty() && (res.charAt(i)>='0' && res.charAt(i)<='9'))
        	{
        		characters.pop();
        	}
        }
        
        if(characters.isEmpty()) return "";
             
        res.setLength(0);
        
        for(char c:characters)
        {
        	res.append(c);
        }
        
        return res.toString();       
    }
}