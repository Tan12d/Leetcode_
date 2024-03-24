class Solution {
    public int findDuplicate(int[] a) {

        Arrays.sort(a);
        
        int t=0,psum=0;
		
		for(int i=0;i<a.length;i++)
		{
			int t1= t^a[i];
            if(t1==psum)
            {
                return a[i];
            }

            psum = t1;
		}
        
        return 0;
    }
}