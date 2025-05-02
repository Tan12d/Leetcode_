class Solution {
    public String pushDominoes(String dominoes) 
    {
        int n = dominoes.length();
		
		int leftClosestR[] = new int[n];
		int rightClosestL[] = new int[n];
		
		String ans = "";
		
		for(int i=0;i<n;i++)
		{
			if(dominoes.charAt(i)=='R')
			{
				leftClosestR[i] = i;
			}
			
			else if(dominoes.charAt(i)=='L')
			{
				leftClosestR[i] = -1;
			}
			
			else
			{
				leftClosestR[i] = i>0 ? leftClosestR[i-1] : -1;
			}
		}	
		
		for(int i=n-1;i>=0;i--)
		{
			if(dominoes.charAt(i)=='R')
			{
				rightClosestL[i] = -1;
			}
			
			else if(dominoes.charAt(i)=='L')
			{
				rightClosestL[i] = i;
			}
			
			else
			{
				rightClosestL[i] = i<(n-1) ? rightClosestL[i+1] : -1;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			int distLeftR = Math.abs(i-leftClosestR[i]);
			int distRightL = Math.abs(i-rightClosestL[i]);
			
			if(leftClosestR[i]==rightClosestL[i])
			{
				ans += ".";
			}
			
			else if(leftClosestR[i]==-1)
			{
				ans+="L";
			}
			
			else if(rightClosestL[i]==-1)
			{
				ans+="R";
			}
			
			else if(leftClosestR[i]==rightClosestL[i])
			{
				ans += ".";
			}
			
			else if(distLeftR == distRightL)
			{
				ans+=".";
			}
			
			else 
			{				
				ans += distLeftR<distRightL ? "R" : "L";
			}
		}
		
		return ans;
    }
}