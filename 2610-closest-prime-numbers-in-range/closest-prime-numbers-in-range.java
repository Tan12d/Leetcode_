class Solution {
    public int[] closestPrimes(int left, int right) 
    {
        boolean isPrime[] = new boolean[right+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        
        for(int i=2;i<=right;i++)
        {
        	if(isPrime[i])
        	{
        		for(int j=2;i*j<=right;j++)
        		{
        			isPrime[i*j]=false;
        		}
        	}
        }
        
        ArrayList<Integer> prime= new ArrayList<Integer>();
        
        for(int i=left;i<=right;i++)
        {
        	if(isPrime[i]) prime.add(i);
        }
        
        System.out.println(prime);
               
        int min = Integer.MAX_VALUE;
        
        int first=0, second=0;
        
        if(prime.size()<2)
        {
        	return new int[] {-1,-1};
        }
              	
        else
        {
        	for(int i=1;i<prime.size();i++)
            {
        		int diff = prime.get(i)-prime.get(i-1);
        		
            	if(min>diff)
            	{
            		min = diff;
            		first=prime.get(i-1);     			
            		second=prime.get(i);
            	}           	 	
            }
        }
                
        return new int[] {first, second};        
    }
}