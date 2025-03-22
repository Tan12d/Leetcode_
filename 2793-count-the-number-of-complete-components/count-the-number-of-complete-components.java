class Solution {
    public int countCompleteComponents(int n, int[][] edges) 
    {
       List<List<Integer>> adjList = new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			adjList.add(new ArrayList<Integer>());
		}
		
		for(int edge[]: edges)
		{
			adjList.get(edge[0]).add(edge[1]);
			adjList.get(edge[1]).add(edge[0]);
		}
		
		int countCompleteComponents = 0;
		
		boolean visited[] = new boolean[n];
		
		for(int i=0;i<n;i++)
		{
			if(!visited[i])
			{
				int nodeCount[]=new int[1];
				int edgeCount[]=new int[1];
				
				dfs(i, adjList, nodeCount, edgeCount, visited);
				
				if(edgeCount[0] == nodeCount[0]*(nodeCount[0]-1))
				{
					countCompleteComponents++;
				}
			}
		}
		
		return countCompleteComponents;
    }
	
	public void dfs(int i, List<List<Integer>> adjList, int nodes[], int edges[], boolean[] visited)
	{
		nodes[0]++;
		visited[i]=true;
		
		for(int neighbour: adjList.get(i))
		{
			edges[0]++;
			if(!visited[neighbour])
			{
				dfs(neighbour, adjList, nodes, edges, visited);
			}
		}
	}
}