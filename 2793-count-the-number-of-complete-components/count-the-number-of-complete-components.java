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
				
				bfs(i, adjList, nodeCount, edgeCount, visited);
				
				if(edgeCount[0] == nodeCount[0]*(nodeCount[0]-1))
				{
					countCompleteComponents++;
				}
			}
		}
		
		return countCompleteComponents;
    }
	
	public static void bfs(int i, List<List<Integer>> adjList, int nodes[], int edges[], boolean[] visited)
	{
		Queue<Integer> q=new LinkedList<Integer>();
		
		q.add(i);
		nodes[0]++;
		visited[i]=true;
		
		while(!q.isEmpty())
		{
			int curr = q.poll();
			
			for(int neighbour: adjList.get(curr))
			{
				edges[0]++;
				
				if(!visited[neighbour])
				{
					nodes[0]++;
					visited[neighbour]=true;
					q.add(neighbour);
				}
			}
		}
	}
}