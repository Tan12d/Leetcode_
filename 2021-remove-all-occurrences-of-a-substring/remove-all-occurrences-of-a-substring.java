class Solution {

    public String removeOccurrences(String s, String part) 
    {
        if(s.indexOf(part)==-1)
		{
			return s;
		}
		
		else
		{
			StringBuilder new_string = new StringBuilder(s);
			
			int idx = new_string.indexOf(part);
			
			return removeOccurrences(new_string.delete(idx, idx+part.length()).toString(), part);
		}
    }
}