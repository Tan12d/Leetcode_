class Solution {
    public int findJudge(int n, int[][] trust) {
        
		int a[]=new int[n+1];
		int b[]=new int[n+1];
		
		for(int p[]:trust)
		{
			a[p[0]]++;
			b[p[1]]++;
		}
		
		for(int i=1;i<b.length;i++)
		{
			if(b[i]==n-1 && a[i]==0)
			{
				return i;
			}
		}
		
		return -1;
    }
}