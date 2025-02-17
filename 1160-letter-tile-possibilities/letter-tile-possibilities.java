class Solution {
    
    public int numTilePossibilities(String tiles) 
    {
        HashSet<String> res=new HashSet<String>();
        boolean visited[] =new boolean[tiles.length()];

        possibleWays(tiles, visited, "", res);

        return res.size();        
    }

    public void possibleWays(String tiles, boolean visited[], String s, HashSet<String> res)
    {
        for(int i=0;i<tiles.length();i++)
        {
            if(!visited[i])
            {
                s+=tiles.charAt(i);
                visited[i]=true;

                res.add(s);

                possibleWays(tiles, visited, s, res);

                visited[i]=false;
                s=s.substring(0, s.length()-1);
            }
        }
    }
}