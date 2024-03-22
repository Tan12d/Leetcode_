class Solution {
    public int findMaxConsecutiveOnes(int[] a) {

        int c=0,max=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1) c++;			
			else c=0;
			
			max=Math.max(max,c);
		}
        
		return max;
    }
}