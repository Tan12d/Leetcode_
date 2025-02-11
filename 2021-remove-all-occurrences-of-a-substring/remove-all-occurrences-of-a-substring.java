class Solution {

    StringBuilder new_string;

    public String removeOccurrences(String s, String part) 
    {
        if(s.indexOf(part)==-1)
		{
			return s;
		}
		
		else
		{
			new_string = new StringBuilder(s);
			
			return removeOccurrences(new_string.delete(new_string.indexOf(part), new_string.indexOf(part)+part.length()).toString(), part);
		}
    }
}