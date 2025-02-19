class Solution {
    public String getHappyString(int n, int k) 
    {
        List<String> sorted_strings=new ArrayList<String>();
		Queue<String> generated_strings=new LinkedList<String>();
        
		generated_strings.offer("a");
        generated_strings.offer("b");
        generated_strings.offer("c");
        
        while(!generated_strings.isEmpty())
        {
        	String curr = generated_strings.poll();
        	
        	if(curr.length()==n)
        	{
        		sorted_strings.add(curr);
        		continue;
        	}

        	char c = curr.charAt(curr.length()-1);
        	
        	if(c=='a')
        	{
        		generated_strings.offer(curr+"b");
        		generated_strings.offer(curr+"c");
        	}
        	
        	else if(c=='b')
        	{
        		generated_strings.offer(curr+"a");
        		generated_strings.offer(curr+"c");        		
        	}
        	
        	else
        	{
        		generated_strings.offer(curr+"a");
        		generated_strings.offer(curr+"b");
        	}

            if(sorted_strings.size()==k) break;
        }
        
        if(sorted_strings.size()<k) return "";
        
        return sorted_strings.get(k-1);        
    }
}