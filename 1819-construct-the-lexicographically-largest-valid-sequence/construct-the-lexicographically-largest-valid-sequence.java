class Solution {
    public int[] constructDistancedSequence(int n) 
    {
        int sequence[] = new int[2*n-1];
        boolean used_num[] = new boolean[n+1];
        
        generateSequences(sequence, used_num, 0, n);
        
        return sequence;
    }
	
	public static boolean generateSequences(int seq[], boolean used[], int index, int n)
	{
		while(index < seq.length && seq[index]!=0)
		{
			index++;
		}
		
		if(index == seq.length) return true;
		
		for(int i=n;i>=1;i--)
		{
			int nextIndex = index+i;
			
			if(!used[i] && (i==1 || (nextIndex < seq.length && seq[nextIndex]==0)))
			{
				seq[index]=i;
				
				if(i>1)
				{
					seq[nextIndex]=i;
				}
				
				used[i]=true;
				
				if(generateSequences(seq, used, index+1, n))
				{
					return true;
				}
				
				seq[index]=0;
				
				if(i>1) seq[nextIndex]=0;
				used[i]=false;
			}
		}
		
		return false;
	}
}