class Solution {
    public int[] queryResults(int limit, int[][] queries) 
    {
        List<Integer> l=new ArrayList<Integer>();
		
		HashMap<Integer, Integer> ballColor = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> colorFreq = new HashMap<Integer, Integer>();
		
		for(int i=0;i<queries.length;++i)
		{
			int ball = queries[i][0];
			int color = queries[i][1];	
			
			if(ballColor.containsKey(ball))
			{
				int prevColor = ballColor.get(ball);
				
				colorFreq.put(prevColor, colorFreq.get(prevColor)-1);
				
				if(colorFreq.get(prevColor)==0) colorFreq.remove(prevColor);
			}
			
			ballColor.put(ball, color);
			
			colorFreq.put(color, colorFreq.getOrDefault(color, 0)+1);
			
			l.add(colorFreq.size());			
		}
		
		return l.stream().mapToInt(i -> i).toArray();
    }
}