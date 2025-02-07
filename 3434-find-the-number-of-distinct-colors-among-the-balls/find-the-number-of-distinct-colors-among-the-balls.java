class Solution {
    public int[] queryResults(int limit, int[][] queries) 
    {
        List<Integer> l=new ArrayList<Integer>();
		
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();
		
		for(int i=0;i<queries.length;i++)
		{
			// color already present
			if(h.containsKey(queries[i][0]))
			{
				int color = h.get(queries[i][0]);
				h1.put(color, h1.get(color)-1);
				
				if(h1.get(color)==0) h1.remove(color);
			}
			
			// first time ball
			h.put(queries[i][0], queries[i][1]);
			
			// first color
			h1.put(queries[i][1], h1.getOrDefault(queries[i][1], 0)+1);
			
			l.add(h1.size());
		}
		
		int color[] = l.stream().mapToInt(i -> i).toArray();
		
		return color;
    }
}