class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        
        for(char i:s.toCharArray())
        {
        	freq[i-'a']++;
        }
        
        for(char i:s.toCharArray())
        {
        	if(freq[i-'a']==1) return s.indexOf(i);
        }
        
        return -1;
    }
}