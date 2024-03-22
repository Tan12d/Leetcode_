class Solution {
    public char findTheDifference(String s, String t) {

        HashMap<Character, Integer> h =new HashMap<>();
		HashMap<Character, Integer> h1 =new HashMap<>();
		
		for(char i: s.toCharArray())
		{
			h.put(i,h.getOrDefault(i,0)+1);
		}
		
		for(char i: t.toCharArray())
		{
			h1.put(i,h1.getOrDefault(i,0)+1);
		}
		
		for(char i: t.toCharArray())
		{
			if(h.get(i)!=h1.get(i)) return i;
		}
		
		return ' ';
    }
}