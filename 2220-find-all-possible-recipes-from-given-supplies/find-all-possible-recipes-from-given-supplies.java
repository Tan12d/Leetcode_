class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) 
    {
        Map<String, Integer> inDegree = new HashMap<String, Integer>();
		Map<String, List<String>> adjList = new HashMap<String, List<String>>();
		
		Set<String> stock = new HashSet<String>(Arrays.asList(supplies));
		
		for(int i=0;i<recipes.length;i++)
		{
			inDegree.put(recipes[i], 0);
			for(String ingredient: ingredients.get(i))
			{
				if(!stock.contains(ingredient))
				{
					adjList.computeIfAbsent(ingredient, k -> new ArrayList<String>()).add(recipes[i]);
					inDegree.put(recipes[i], inDegree.getOrDefault(recipes[i], 0)+1);
				}
			}
		}

		Queue<String> q = new LinkedList<String>();
		
		for(Map.Entry<String, Integer> entry: inDegree.entrySet())
		{
			if(entry.getValue()==0)
			{
				q.offer(entry.getKey());
			}
		}

		List<String> res = new ArrayList<String>();
			
		while(!q.isEmpty())
		{
			String currRecipe = q.poll();
			res.add(currRecipe);
			
			if(adjList.containsKey(currRecipe))
			{
				for(String reqRecipe: adjList.get(currRecipe))
				{
					inDegree.put(reqRecipe, inDegree.get(reqRecipe)-1);
					if(inDegree.get(reqRecipe)==0) 
					{
						q.offer(reqRecipe);
					}
				}
			}
		}
		
        return res;		
    }
}